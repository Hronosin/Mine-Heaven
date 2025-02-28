
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import hronosin.mc.mineheavenutilities.client.renderer.NecronSoldierRenderer;
import hronosin.mc.mineheavenutilities.client.renderer.InterdimensionalWandererRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineHeavenUtilitiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.URNUYVKRUV.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.ANTIMATTERORB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.BEELZEBUB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.DRAGON_STORM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.INTERDIMENSIONAL_WANDERER.get(), InterdimensionalWandererRenderer::new);
		event.registerEntityRenderer(MineHeavenUtilitiesModEntities.NECRON_SOLDIER.get(), NecronSoldierRenderer::new);
	}
}
