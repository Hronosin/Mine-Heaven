
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import hronosin.mc.mineheavenutilities.client.model.ModelSusano;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MineHeavenUtilitiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSusano.LAYER_LOCATION, ModelSusano::createBodyLayer);
	}
}
