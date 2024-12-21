package hronosin.mc.mineheavenutilities.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModItems;

public class KaBoomPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MineHeavenUtilitiesModItems.SEED_OF_THE_WORLD.get())) : false) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
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
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 70, Explosion.BlockInteraction.BREAK);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (x + 10), y, z, 70, Explosion.BlockInteraction.BREAK);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (x + 10), y, z, 70, Explosion.BlockInteraction.BREAK);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, (z + 10), 70, Explosion.BlockInteraction.BREAK);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, (z + 10), 70, Explosion.BlockInteraction.BREAK);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 200);
		}
	}
}
