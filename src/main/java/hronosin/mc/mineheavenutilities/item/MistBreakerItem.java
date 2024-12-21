
package hronosin.mc.mineheavenutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import hronosin.mc.mineheavenutilities.procedures.MistBreakerPriNazhatiiPravoiKnopkoiMyshiProcedure;
import hronosin.mc.mineheavenutilities.procedures.MistBreakerKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure;

public class MistBreakerItem extends SwordItem {
	public MistBreakerItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MistBreakerKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MistBreakerPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
