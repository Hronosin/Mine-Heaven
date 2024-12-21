package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class PocketTeleporterPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putDouble("blockX", (entity.getX()));
			itemstack.getOrCreateTag().putDouble("blockY", (entity.getY()));
			itemstack.getOrCreateTag().putDouble("blockZ", (entity.getZ()));
			itemstack.getOrCreateTag().putBoolean("canTeleport", (true));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u0422\u043E\u0447\u043A\u0430 \u0443\u0441\u043F\u0435\u0448\u043D\u043E \u0443\u0441\u0442\u0430\u043D\u043E\u0432\u043B\u0435\u043D\u0430"), (true));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
	}
}
