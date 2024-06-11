
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.MulticubeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MulticubeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MulticubeMod.MODID);
	public static final RegistryObject<CreativeModeTab> ONGLET_TEST = REGISTRY.register("onglet_test",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.multicube.onglet_test")).icon(() -> new ItemStack(MulticubeModBlocks.TEST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MulticubeModBlocks.TEST.get().asItem());
				tabData.accept(MulticubeModItems.CDTEST.get());
				tabData.accept(MulticubeModBlocks.WEBEC.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MulticubeModBlocks.BOISTEST_WOOD.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_LOG.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_PLANKS.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_STAIRS.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_SLAB.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_FENCE.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_FENCE_GATE.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_PRESSURE_PLATE.get().asItem());
			tabData.accept(MulticubeModBlocks.BOISTEST_BUTTON.get().asItem());
			tabData.accept(MulticubeModBlocks.D_ORE.get().asItem());
			tabData.accept(MulticubeModBlocks.D_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MulticubeModItems.D_SWORD.get());
			tabData.accept(MulticubeModItems.D_ARMOR_HELMET.get());
			tabData.accept(MulticubeModItems.D_ARMOR_CHESTPLATE.get());
			tabData.accept(MulticubeModItems.D_ARMOR_LEGGINGS.get());
			tabData.accept(MulticubeModItems.D_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MulticubeModItems.ENTTEST_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MulticubeModItems.D_DUST.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MulticubeModItems.PICTEST.get());
			tabData.accept(MulticubeModItems.D_PICKAXE.get());
			tabData.accept(MulticubeModItems.D_AXE.get());
			tabData.accept(MulticubeModItems.D_SHOVEL.get());
			tabData.accept(MulticubeModItems.D_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MulticubeModBlocks.BOISTEST_LEAVES.get().asItem());
		}
	}
}
