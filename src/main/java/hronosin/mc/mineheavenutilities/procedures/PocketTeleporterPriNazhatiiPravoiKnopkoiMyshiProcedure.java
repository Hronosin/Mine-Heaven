package hronosin.mc.mineheavenutilities.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import java.util.Random;

public class PocketTeleporterPriNazhatiiPravoiKnopkoiMyshiProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("canTeleport") && !entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, (false), (false)));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					{
						Entity _ent = entity;
						_ent.teleportTo((itemstack.getOrCreateTag().getDouble("blockX")), (itemstack.getOrCreateTag().getDouble("blockY") + Mth.nextDouble(new Random(), 1, 4)), (itemstack.getOrCreateTag().getDouble("blockZ")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((itemstack.getOrCreateTag().getDouble("blockX")), (itemstack.getOrCreateTag().getDouble("blockY") + Mth.nextDouble(new Random(), 1, 4)), (itemstack.getOrCreateTag().getDouble("blockZ")),
									_ent.getYRot(), _ent.getXRot());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
		}
	}
}
