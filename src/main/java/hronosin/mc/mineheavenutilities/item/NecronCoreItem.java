
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import hronosin.mc.mineheavenutilities.procedures.NecronCorePriNazhatiiPravoiKnopkoiMyshiProcedure;
import hronosin.mc.mineheavenutilities.procedures.NecronCoreKoghdaPriedmietVInvientarieProcedure;

public class NecronCoreItem extends Item {
	public NecronCoreItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NecronCorePriNazhatiiPravoiKnopkoiMyshiProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		NecronCorePriNazhatiiPravoiKnopkoiMyshiProcedure.execute(context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		NecronCoreKoghdaPriedmietVInvientarieProcedure.execute(world, entity);
	}
}
