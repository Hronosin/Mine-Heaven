package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class SpearofScarletButterfliesKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(new Random(), 1, 40) == 8) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.SUICIDE_MARK.get(), 40, 1, (true), (false)));
		}
	}
}
