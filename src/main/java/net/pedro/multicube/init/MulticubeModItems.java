
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.item.PictestItem;
import net.pedro.multicube.item.DSwordItem;
import net.pedro.multicube.item.DShovelItem;
import net.pedro.multicube.item.DPickaxeItem;
import net.pedro.multicube.item.DHoeItem;
import net.pedro.multicube.item.DDustItem;
import net.pedro.multicube.item.DAxeItem;
import net.pedro.multicube.item.DArmorItem;
import net.pedro.multicube.item.CdtestItem;
import net.pedro.multicube.MulticubeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class MulticubeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MulticubeMod.MODID);
	public static final RegistryObject<Item> TEST = block(MulticubeModBlocks.TEST);
	public static final RegistryObject<Item> CDTEST = REGISTRY.register("cdtest", () -> new CdtestItem());
	public static final RegistryObject<Item> PICTEST = REGISTRY.register("pictest", () -> new PictestItem());
	public static final RegistryObject<Item> ENTTEST_SPAWN_EGG = REGISTRY.register("enttest_spawn_egg", () -> new ForgeSpawnEggItem(MulticubeModEntities.ENTTEST, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BOISTEST_WOOD = block(MulticubeModBlocks.BOISTEST_WOOD);
	public static final RegistryObject<Item> BOISTEST_LOG = block(MulticubeModBlocks.BOISTEST_LOG);
	public static final RegistryObject<Item> BOISTEST_PLANKS = block(MulticubeModBlocks.BOISTEST_PLANKS);
	public static final RegistryObject<Item> BOISTEST_LEAVES = block(MulticubeModBlocks.BOISTEST_LEAVES);
	public static final RegistryObject<Item> BOISTEST_STAIRS = block(MulticubeModBlocks.BOISTEST_STAIRS);
	public static final RegistryObject<Item> BOISTEST_SLAB = block(MulticubeModBlocks.BOISTEST_SLAB);
	public static final RegistryObject<Item> BOISTEST_FENCE = block(MulticubeModBlocks.BOISTEST_FENCE);
	public static final RegistryObject<Item> BOISTEST_FENCE_GATE = block(MulticubeModBlocks.BOISTEST_FENCE_GATE);
	public static final RegistryObject<Item> BOISTEST_PRESSURE_PLATE = block(MulticubeModBlocks.BOISTEST_PRESSURE_PLATE);
	public static final RegistryObject<Item> BOISTEST_BUTTON = block(MulticubeModBlocks.BOISTEST_BUTTON);
	public static final RegistryObject<Item> D_DUST = REGISTRY.register("d_dust", () -> new DDustItem());
	public static final RegistryObject<Item> D_ORE = block(MulticubeModBlocks.D_ORE);
	public static final RegistryObject<Item> D_BLOCK = block(MulticubeModBlocks.D_BLOCK);
	public static final RegistryObject<Item> D_PICKAXE = REGISTRY.register("d_pickaxe", () -> new DPickaxeItem());
	public static final RegistryObject<Item> D_AXE = REGISTRY.register("d_axe", () -> new DAxeItem());
	public static final RegistryObject<Item> D_SWORD = REGISTRY.register("d_sword", () -> new DSwordItem());
	public static final RegistryObject<Item> D_SHOVEL = REGISTRY.register("d_shovel", () -> new DShovelItem());
	public static final RegistryObject<Item> D_HOE = REGISTRY.register("d_hoe", () -> new DHoeItem());
	public static final RegistryObject<Item> D_ARMOR_HELMET = REGISTRY.register("d_armor_helmet", () -> new DArmorItem.Helmet());
	public static final RegistryObject<Item> D_ARMOR_CHESTPLATE = REGISTRY.register("d_armor_chestplate", () -> new DArmorItem.Chestplate());
	public static final RegistryObject<Item> D_ARMOR_LEGGINGS = REGISTRY.register("d_armor_leggings", () -> new DArmorItem.Leggings());
	public static final RegistryObject<Item> D_ARMOR_BOOTS = REGISTRY.register("d_armor_boots", () -> new DArmorItem.Boots());
	public static final RegistryObject<Item> WEBEC = block(MulticubeModBlocks.WEBEC);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
