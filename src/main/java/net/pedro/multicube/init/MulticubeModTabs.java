
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
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MulticubeModItems.ENTTEST_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MulticubeModItems.PICTEST.get());
		}
	}
}
