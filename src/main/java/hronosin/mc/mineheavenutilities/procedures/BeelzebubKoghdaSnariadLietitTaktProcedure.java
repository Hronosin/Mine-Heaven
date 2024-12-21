package hronosin.mc.mineheavenutilities.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.core.particles.ParticleTypes;

public class BeelzebubKoghdaSnariadLietitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, 3, 3, 3);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
	}
}
