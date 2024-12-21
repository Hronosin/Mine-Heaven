
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineHeavenUtilitiesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("mine_heaven_utilities", "dancin"), new SoundEvent(new ResourceLocation("mine_heaven_utilities", "dancin")));
		REGISTRY.put(new ResourceLocation("mine_heaven_utilities", "bury_the_light"), new SoundEvent(new ResourceLocation("mine_heaven_utilities", "bury_the_light")));
		REGISTRY.put(new ResourceLocation("mine_heaven_utilities", "sweater_weather"), new SoundEvent(new ResourceLocation("mine_heaven_utilities", "sweater_weather")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
