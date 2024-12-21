
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import hronosin.mc.mineheavenutilities.potion.SuicideMarkMobEffect;
import hronosin.mc.mineheavenutilities.potion.NecroRewindMobEffect;
import hronosin.mc.mineheavenutilities.potion.FlyMobEffect;
import hronosin.mc.mineheavenutilities.potion.BleedingMobEffect;
import hronosin.mc.mineheavenutilities.potion.AmaterasuFireMobEffect;
import hronosin.mc.mineheavenutilities.MineHeavenUtilitiesMod;

public class MineHeavenUtilitiesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MineHeavenUtilitiesMod.MODID);
	public static final RegistryObject<MobEffect> NECRO_REWIND = REGISTRY.register("necro_rewind", () -> new NecroRewindMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> SUICIDE_MARK = REGISTRY.register("suicide_mark", () -> new SuicideMarkMobEffect());
	public static final RegistryObject<MobEffect> FLY = REGISTRY.register("fly", () -> new FlyMobEffect());
	public static final RegistryObject<MobEffect> AMATERASU_FIRE = REGISTRY.register("amaterasu_fire", () -> new AmaterasuFireMobEffect());
}
