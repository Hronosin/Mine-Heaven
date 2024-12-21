
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import hronosin.mc.mineheavenutilities.procedures.UchihasymbolKoghdaPriedmietVInvientarieProcedure;

public class UchihasymbolItem extends Item {
	public UchihasymbolItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UchihasymbolKoghdaPriedmietVInvientarieProcedure.execute(world, entity);
	}
}
