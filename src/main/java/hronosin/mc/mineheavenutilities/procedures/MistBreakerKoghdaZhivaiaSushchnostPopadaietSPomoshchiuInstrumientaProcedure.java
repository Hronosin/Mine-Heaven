package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class MistBreakerKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(new Random(), 1, 10) == 9) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.BLEEDING.get(), 60, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, (false), (false)));
		}
	}
}
