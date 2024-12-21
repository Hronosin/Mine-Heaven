
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import hronosin.mc.mineheavenutilities.procedures.DefiledValkyriePriNazhatiiPravoiKnopkoiMyshiProcedure;
import hronosin.mc.mineheavenutilities.procedures.DefiledValkyrieKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure;

public class DefiledValkyrieItem extends SwordItem {
	public DefiledValkyrieItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 84;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.7999999999999998f, new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DefiledValkyrieKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		DefiledValkyriePriNazhatiiPravoiKnopkoiMyshiProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
