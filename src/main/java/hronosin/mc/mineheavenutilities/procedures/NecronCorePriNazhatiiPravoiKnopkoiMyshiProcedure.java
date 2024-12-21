package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import hronosin.mc.mineheavenutilities.init.MineHeavenUtilitiesModMobEffects;

public class NecronCorePriNazhatiiPravoiKnopkoiMyshiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 1000);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MineHeavenUtilitiesModMobEffects.NECRO_REWIND.get(), 600, 1));
	}
}
