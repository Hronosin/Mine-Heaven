
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import hronosin.mc.mineheavenutilities.procedures.PocketTeleporterPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure;
import hronosin.mc.mineheavenutilities.procedures.PocketTeleporterPriNazhatiiPravoiKnopkoiMyshiProcedure;

public class PocketTeleporterItem extends Item {
	public PocketTeleporterItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PocketTeleporterPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(world, entity, itemstack);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PocketTeleporterPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
