
package hronosin.mc.mineheavenutilities.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import hronosin.mc.mineheavenutilities.procedures.FlyKoghdaEffiektZakanchivaietsiaProcedure;
import hronosin.mc.mineheavenutilities.procedures.FlyKoghdaEffiektNachatprimienienProcedure;

public class FlyMobEffect extends MobEffect {
	public FlyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mine_heaven_utilities.fly";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FlyKoghdaEffiektNachatprimienienProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FlyKoghdaEffiektZakanchivaietsiaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
