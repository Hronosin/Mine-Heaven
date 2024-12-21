package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class UrnuyvkruvKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.AMATERASU_FIRE.get(), 80, 1));
	}
}
