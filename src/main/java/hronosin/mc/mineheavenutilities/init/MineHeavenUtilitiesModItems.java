
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hronosin.mc.mineheavenutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import hronosin.mc.mineheavenutilities.item.UrnuyvkruvItem;
import hronosin.mc.mineheavenutilities.item.UchihasymbolItem;
import hronosin.mc.mineheavenutilities.item.UchihaSymbolBrokenItem;
import hronosin.mc.mineheavenutilities.item.SweaterWeatherItem;
import hronosin.mc.mineheavenutilities.item.SusanoItem;
import hronosin.mc.mineheavenutilities.item.SpearofScarletButterfliesItem;
import hronosin.mc.mineheavenutilities.item.SeedOfTheWorldItem;
import hronosin.mc.mineheavenutilities.item.PocketTeleporterItem;
import hronosin.mc.mineheavenutilities.item.NecronStaffItem;
import hronosin.mc.mineheavenutilities.item.NecronCoreItem;
import hronosin.mc.mineheavenutilities.item.NecronArmorItem;
import hronosin.mc.mineheavenutilities.item.MistBreakerItem;
import hronosin.mc.mineheavenutilities.item.LightbearingbenefactorItem;
import hronosin.mc.mineheavenutilities.item.DragonStormItem;
import hronosin.mc.mineheavenutilities.item.DefiledValkyrieItem;
import hronosin.mc.mineheavenutilities.item.DancinItem;
import hronosin.mc.mineheavenutilities.item.CrescentRoseItem;
import hronosin.mc.mineheavenutilities.item.CallOfTheFirstItem;
import hronosin.mc.mineheavenutilities.item.BuryTheLightItem;
import hronosin.mc.mineheavenutilities.item.BeelzebubItem;
import hronosin.mc.mineheavenutilities.item.AstralArmorItem;
import hronosin.mc.mineheavenutilities.item.AntimatterorbItem;
import hronosin.mc.mineheavenutilities.MineHeavenUtilitiesMod;

public class MineHeavenUtilitiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineHeavenUtilitiesMod.MODID);
	public static final RegistryObject<Item> NECRON_CORE = REGISTRY.register("necron_core", () -> new NecronCoreItem());
	public static final RegistryObject<Item> ASTRAL_INFECTED_WOOD = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_LOG = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_PLANKS = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_LEAVES = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_STAIRS = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_SLAB = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_FENCE = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ASTRAL_INFECTED_FENCE_GATE = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ASTRAL_INFECTED_PRESSURE_PLATE = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ASTRAL_INFECTED_BUTTON = block(MineHeavenUtilitiesModBlocks.ASTRAL_INFECTED_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NECRON_STAFF = REGISTRY.register("necron_staff", () -> new NecronStaffItem());
	public static final RegistryObject<Item> NECRON_ARMOR_HELMET = REGISTRY.register("necron_armor_helmet", () -> new NecronArmorItem.Helmet());
	public static final RegistryObject<Item> NECRON_ARMOR_CHESTPLATE = REGISTRY.register("necron_armor_chestplate", () -> new NecronArmorItem.Chestplate());
	public static final RegistryObject<Item> NECRON_ARMOR_LEGGINGS = REGISTRY.register("necron_armor_leggings", () -> new NecronArmorItem.Leggings());
	public static final RegistryObject<Item> NECRON_ARMOR_BOOTS = REGISTRY.register("necron_armor_boots", () -> new NecronArmorItem.Boots());
	public static final RegistryObject<Item> CRESCENT_ROSE = REGISTRY.register("crescent_rose", () -> new CrescentRoseItem());
	public static final RegistryObject<Item> POCKET_TELEPORTER = REGISTRY.register("pocket_teleporter", () -> new PocketTeleporterItem());
	public static final RegistryObject<Item> ASTRAL_ARMOR_HELMET = REGISTRY.register("astral_armor_helmet", () -> new AstralArmorItem.Helmet());
	public static final RegistryObject<Item> ASTRAL_ARMOR_CHESTPLATE = REGISTRY.register("astral_armor_chestplate", () -> new AstralArmorItem.Chestplate());
	public static final RegistryObject<Item> ASTRAL_ARMOR_LEGGINGS = REGISTRY.register("astral_armor_leggings", () -> new AstralArmorItem.Leggings());
	public static final RegistryObject<Item> ASTRAL_ARMOR_BOOTS = REGISTRY.register("astral_armor_boots", () -> new AstralArmorItem.Boots());
	public static final RegistryObject<Item> MIST_BREAKER = REGISTRY.register("mist_breaker", () -> new MistBreakerItem());
	public static final RegistryObject<Item> SPEAROF_SCARLET_BUTTERFLIES = REGISTRY.register("spearof_scarlet_butterflies", () -> new SpearofScarletButterfliesItem());
	public static final RegistryObject<Item> SWEATER_WEATHER = REGISTRY.register("sweater_weather", () -> new SweaterWeatherItem());
	public static final RegistryObject<Item> BURY_THE_LIGHT = REGISTRY.register("bury_the_light", () -> new BuryTheLightItem());
	public static final RegistryObject<Item> DANCIN = REGISTRY.register("dancin", () -> new DancinItem());
	public static final RegistryObject<Item> UCHIHASYMBOL = REGISTRY.register("uchihasymbol", () -> new UchihasymbolItem());
	public static final RegistryObject<Item> URNUYVKRUV = REGISTRY.register("urnuyvkruv", () -> new UrnuyvkruvItem());
	public static final RegistryObject<Item> SUSANO_CHESTPLATE = REGISTRY.register("susano_chestplate", () -> new SusanoItem.Chestplate());
	public static final RegistryObject<Item> UCHIHA_SYMBOL_BROKEN = REGISTRY.register("uchiha_symbol_broken", () -> new UchihaSymbolBrokenItem());
	public static final RegistryObject<Item> SEED_OF_THE_WORLD = REGISTRY.register("seed_of_the_world", () -> new SeedOfTheWorldItem());
	public static final RegistryObject<Item> ANTIMATTERORB = REGISTRY.register("antimatterorb", () -> new AntimatterorbItem());
	public static final RegistryObject<Item> DEFILED_VALKYRIE = REGISTRY.register("defiled_valkyrie", () -> new DefiledValkyrieItem());
	public static final RegistryObject<Item> LIGHTBEARINGBENEFACTOR = REGISTRY.register("lightbearingbenefactor", () -> new LightbearingbenefactorItem());
	public static final RegistryObject<Item> CALL_OF_THE_FIRST = REGISTRY.register("call_of_the_first", () -> new CallOfTheFirstItem());
	public static final RegistryObject<Item> BEELZEBUB = REGISTRY.register("beelzebub", () -> new BeelzebubItem());
	public static final RegistryObject<Item> DRAGON_STORM = REGISTRY.register("dragon_storm", () -> new DragonStormItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
