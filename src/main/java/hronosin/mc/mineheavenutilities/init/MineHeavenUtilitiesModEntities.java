
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import hronosin.mc.mineheavenutilities.entity.UrnuyvkruvEntity;
import hronosin.mc.mineheavenutilities.entity.NecronSoldierEntity;
import hronosin.mc.mineheavenutilities.entity.InterdimensionalWandererEntity;
import hronosin.mc.mineheavenutilities.entity.DragonStormEntity;
import hronosin.mc.mineheavenutilities.entity.BeelzebubEntity;
import hronosin.mc.mineheavenutilities.entity.AntimatterorbEntity;
import hronosin.mc.mineheavenutilities.MineHeavenUtilitiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineHeavenUtilitiesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MineHeavenUtilitiesMod.MODID);
	public static final RegistryObject<EntityType<UrnuyvkruvEntity>> URNUYVKRUV = register("projectile_urnuyvkruv",
			EntityType.Builder.<UrnuyvkruvEntity>of(UrnuyvkruvEntity::new, MobCategory.MISC).setCustomClientFactory(UrnuyvkruvEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AntimatterorbEntity>> ANTIMATTERORB = register("projectile_antimatterorb",
			EntityType.Builder.<AntimatterorbEntity>of(AntimatterorbEntity::new, MobCategory.MISC).setCustomClientFactory(AntimatterorbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeelzebubEntity>> BEELZEBUB = register("projectile_beelzebub",
			EntityType.Builder.<BeelzebubEntity>of(BeelzebubEntity::new, MobCategory.MISC).setCustomClientFactory(BeelzebubEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DragonStormEntity>> DRAGON_STORM = register("projectile_dragon_storm",
			EntityType.Builder.<DragonStormEntity>of(DragonStormEntity::new, MobCategory.MISC).setCustomClientFactory(DragonStormEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InterdimensionalWandererEntity>> INTERDIMENSIONAL_WANDERER = register("interdimensional_wanderer",
			EntityType.Builder.<InterdimensionalWandererEntity>of(InterdimensionalWandererEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)
					.setCustomClientFactory(InterdimensionalWandererEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NecronSoldierEntity>> NECRON_SOLDIER = register("necron_soldier", EntityType.Builder.<NecronSoldierEntity>of(NecronSoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(NecronSoldierEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			InterdimensionalWandererEntity.init();
			NecronSoldierEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(INTERDIMENSIONAL_WANDERER.get(), InterdimensionalWandererEntity.createAttributes().build());
		event.put(NECRON_SOLDIER.get(), NecronSoldierEntity.createAttributes().build());
	}
}
