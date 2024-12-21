
package hronosin.mc.mineheavenutilities.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import hronosin.mc.mineheavenutilities.procedures.NecroRewindKoghdaEffiektZakanchivaietsiaProcedure;
import hronosin.mc.mineheavenutilities.procedures.NecroRewindKazhdyiTikVoVriemiaEffiektaProcedure;

public class NecroRewindMobEffect extends MobEffect {
	public NecroRewindMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10027162);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mine_heaven_utilities.necro_rewind";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		NecroRewindKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		NecroRewindKoghdaEffiektZakanchivaietsiaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
