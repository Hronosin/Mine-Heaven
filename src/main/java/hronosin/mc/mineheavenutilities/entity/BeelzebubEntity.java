
package hronosin.mc.mineheavenutilities.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

import hronosin.mc.mineheavenutilities.procedures.BeelzebubKoghdaSnariadPriziemliaietsiaNaBlokProcedure;
import hronosin.mc.mineheavenutilities.procedures.BeelzebubKoghdaSnariadPopadaietVSushchnostProcedure;
import hronosin.mc.mineheavenutilities.procedures.BeelzebubKoghdaSnariadLietitTaktProcedure;
import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BeelzebubEntity extends AbstractArrow implements ItemSupplier {
	public BeelzebubEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MineHeavenUtilitiesModEntities.BEELZEBUB.get(), world);
	}

	public BeelzebubEntity(EntityType<? extends BeelzebubEntity> type, Level world) {
		super(type, world);
	}

	public BeelzebubEntity(EntityType<? extends BeelzebubEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BeelzebubEntity(EntityType<? extends BeelzebubEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.CHORUS_FLOWER);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.AMETHYST_SHARD);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		BeelzebubKoghdaSnariadPopadaietVSushchnostProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		BeelzebubKoghdaSnariadPriziemliaietsiaNaBlokProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		BeelzebubKoghdaSnariadLietitTaktProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this.getOwner());
		if (this.inGround)
			this.discard();
	}

	public static BeelzebubEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		BeelzebubEntity entityarrow = new BeelzebubEntity(MineHeavenUtilitiesModEntities.BEELZEBUB.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static BeelzebubEntity shoot(LivingEntity entity, LivingEntity target) {
		BeelzebubEntity entityarrow = new BeelzebubEntity(MineHeavenUtilitiesModEntities.BEELZEBUB.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3.9999999999999996);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
