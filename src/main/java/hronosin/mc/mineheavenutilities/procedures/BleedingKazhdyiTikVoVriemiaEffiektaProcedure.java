package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class BleedingKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC,
				(float) (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineHeavenUtilitiesModMobEffects.BLEEDING.get()) ? _livEnt.getEffect(MineHeavenUtilitiesModMobEffects.BLEEDING.get()).getAmplifier() : 0)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 40, 0, (false), (false)));
	}
}
