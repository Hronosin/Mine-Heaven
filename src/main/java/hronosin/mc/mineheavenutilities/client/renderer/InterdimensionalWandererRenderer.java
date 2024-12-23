
package hronosin.mc.mineheavenutilities.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import hronosin.mc.mineheavenutilities.entity.InterdimensionalWandererEntity;

public class InterdimensionalWandererRenderer extends HumanoidMobRenderer<InterdimensionalWandererEntity, HumanoidModel<InterdimensionalWandererEntity>> {
	public InterdimensionalWandererRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(InterdimensionalWandererEntity entity) {
		return new ResourceLocation("mine_heaven_utilities:textures/entities/5e7bb843e99cca00.png");
	}
}
