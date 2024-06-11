
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.item.PictestItem;
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
