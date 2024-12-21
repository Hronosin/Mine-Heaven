
package hronosin.mc.mineheavenutilities.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import hronosin.mc.mineheavenutilities.procedures.SuicideMarkKoghdaEffiektZakanchivaietsiaProcedure;
import hronosin.mc.mineheavenutilities.procedures.SuicideMarkKazhdyiTikVoVriemiaEffiektaProcedure;

public class SuicideMarkMobEffect extends MobEffect {
	public SuicideMarkMobEffect() {
		super(MobEffectCategory.HARMFUL, -39322);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mine_heaven_utilities.suicide_mark";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SuicideMarkKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SuicideMarkKoghdaEffiektZakanchivaietsiaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
