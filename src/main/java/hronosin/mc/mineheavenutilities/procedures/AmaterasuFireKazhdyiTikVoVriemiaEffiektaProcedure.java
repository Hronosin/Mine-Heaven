package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class AmaterasuFireKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineHeavenUtilitiesModMobEffects.AMATERASU_FIRE.get()) : false) {
			entity.hurt(DamageSource.ON_FIRE, 1);
			entity.setSecondsOnFire(2);
		}
	}
}
