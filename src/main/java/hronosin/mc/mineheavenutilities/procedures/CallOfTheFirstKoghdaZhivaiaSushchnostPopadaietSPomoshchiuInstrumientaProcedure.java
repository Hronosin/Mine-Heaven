package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class CallOfTheFirstKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.OUT_OF_WORLD, 20);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.BLEEDING.get(), 60, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.AMATERASU_FIRE.get(), 60, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.SUICIDE_MARK.get(), 60, 1, (false), (false)));
	}
}
