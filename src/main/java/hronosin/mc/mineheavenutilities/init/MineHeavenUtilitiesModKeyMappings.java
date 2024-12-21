
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import hronosin.mc.mineheavenutilities.network.SusanoArrmorMessage;
import hronosin.mc.mineheavenutilities.network.OrbOfDestroyMessage;
import hronosin.mc.mineheavenutilities.network.KaBoomMessage;
import hronosin.mc.mineheavenutilities.network.GenjutsuskillMessage;
import hronosin.mc.mineheavenutilities.network.GamechangerMessage;
import hronosin.mc.mineheavenutilities.network.AmaterasuMessage;
import hronosin.mc.mineheavenutilities.MineHeavenUtilitiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MineHeavenUtilitiesModKeyMappings {
	public static final KeyMapping SUSANO_ARRMOR = new KeyMapping("key.mine_heaven_utilities.susano_arrmor", GLFW.GLFW_KEY_G, "key.categories.mineheaven_admin");
	public static final KeyMapping AMATERASU = new KeyMapping("key.mine_heaven_utilities.amaterasu", GLFW.GLFW_KEY_H, "key.categories.mineheaven_admin");
	public static final KeyMapping GENJUTSUSKILL = new KeyMapping("key.mine_heaven_utilities.genjutsuskill", GLFW.GLFW_KEY_P, "key.categories.mineheaven_admin");
	public static final KeyMapping GAMECHANGER = new KeyMapping("key.mine_heaven_utilities.gamechanger", GLFW.GLFW_KEY_U, "key.categories.mineheaven_admin");
	public static final KeyMapping ORB_OF_DESTROY = new KeyMapping("key.mine_heaven_utilities.orb_of_destroy", GLFW.GLFW_KEY_F17, "key.categories.mineheaven_admin");
	public static final KeyMapping KA_BOOM = new KeyMapping("key.mine_heaven_utilities.ka_boom", GLFW.GLFW_KEY_M, "key.categories.mineheaven_admin");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SUSANO_ARRMOR);
		ClientRegistry.registerKeyBinding(AMATERASU);
		ClientRegistry.registerKeyBinding(GENJUTSUSKILL);
		ClientRegistry.registerKeyBinding(GAMECHANGER);
		ClientRegistry.registerKeyBinding(ORB_OF_DESTROY);
		ClientRegistry.registerKeyBinding(KA_BOOM);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == SUSANO_ARRMOR.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new SusanoArrmorMessage(0, 0));
						SusanoArrmorMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == AMATERASU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new AmaterasuMessage(0, 0));
						AmaterasuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == GENJUTSUSKILL.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new GenjutsuskillMessage(0, 0));
						GenjutsuskillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == GAMECHANGER.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new GamechangerMessage(0, 0));
						GamechangerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == ORB_OF_DESTROY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new OrbOfDestroyMessage(0, 0));
						OrbOfDestroyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == KA_BOOM.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MineHeavenUtilitiesMod.PACKET_HANDLER.sendToServer(new KaBoomMessage(0, 0));
						KaBoomMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
