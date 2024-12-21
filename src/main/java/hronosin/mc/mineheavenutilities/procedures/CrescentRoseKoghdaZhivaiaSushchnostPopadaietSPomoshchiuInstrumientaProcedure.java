package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class CrescentRoseKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextDouble(new Random(), 1, 20) == 19) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.BLEEDING.get(), 80, 1, (true), (false)));
		}
	}
}
