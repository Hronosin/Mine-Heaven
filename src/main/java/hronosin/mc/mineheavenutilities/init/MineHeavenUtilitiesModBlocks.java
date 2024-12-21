
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import hronosin.mc.mineheavenutilities.block.Astral_infectedWoodBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedStairsBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedSlabBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedPressurePlateBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedPlanksBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedLogBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedLeavesBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedFenceGateBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedFenceBlock;
import hronosin.mc.mineheavenutilities.block.Astral_infectedButtonBlock;
import hronosin.mc.mineheavenutilities.MineHeavenUtilitiesMod;

public class MineHeavenUtilitiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineHeavenUtilitiesMod.MODID);
	public static final RegistryObject<Block> ASTRAL_INFECTED_WOOD = REGISTRY.register("astral_infected_wood", () -> new Astral_infectedWoodBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_LOG = REGISTRY.register("astral_infected_log", () -> new Astral_infectedLogBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_PLANKS = REGISTRY.register("astral_infected_planks", () -> new Astral_infectedPlanksBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_LEAVES = REGISTRY.register("astral_infected_leaves", () -> new Astral_infectedLeavesBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_STAIRS = REGISTRY.register("astral_infected_stairs", () -> new Astral_infectedStairsBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_SLAB = REGISTRY.register("astral_infected_slab", () -> new Astral_infectedSlabBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_FENCE = REGISTRY.register("astral_infected_fence", () -> new Astral_infectedFenceBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_FENCE_GATE = REGISTRY.register("astral_infected_fence_gate", () -> new Astral_infectedFenceGateBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_PRESSURE_PLATE = REGISTRY.register("astral_infected_pressure_plate", () -> new Astral_infectedPressurePlateBlock());
	public static final RegistryObject<Block> ASTRAL_INFECTED_BUTTON = REGISTRY.register("astral_infected_button", () -> new Astral_infectedButtonBlock());
}
