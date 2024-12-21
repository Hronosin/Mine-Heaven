
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModSounds;

public class BuryTheLightItem extends RecordItem {
	public BuryTheLightItem() {
		super(15, MineHeavenUtilitiesModSounds.REGISTRY.get(new ResourceLocation("mine_heaven_utilities:bury_the_light")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
