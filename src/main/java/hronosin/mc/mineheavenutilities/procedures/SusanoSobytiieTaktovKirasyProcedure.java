package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModItems;

public class SusanoSobytiieTaktovKirasyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == MineHeavenUtilitiesModItems.SUSANO_CHESTPLATE.get()) == (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MineHeavenUtilitiesModItems.UCHIHASYMBOL.get()))
				: false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = (true);
				_player.onUpdateAbilities();
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 9, (true), (false)));
		} else {
			entity.hurt(DamageSource.MAGIC, 6);
		}
	}
}
