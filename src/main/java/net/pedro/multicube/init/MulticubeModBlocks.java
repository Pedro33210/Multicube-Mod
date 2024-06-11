
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.block.TestBlock;
import net.pedro.multicube.block.DOreBlock;
import net.pedro.multicube.block.DBlockBlock;
import net.pedro.multicube.block.BoistestWoodBlock;
import net.pedro.multicube.block.BoistestStairsBlock;
import net.pedro.multicube.block.BoistestSlabBlock;
import net.pedro.multicube.block.BoistestPressurePlateBlock;
import net.pedro.multicube.block.BoistestPlanksBlock;
import net.pedro.multicube.block.BoistestLogBlock;
import net.pedro.multicube.block.BoistestLeavesBlock;
import net.pedro.multicube.block.BoistestFenceGateBlock;
import net.pedro.multicube.block.BoistestFenceBlock;
import net.pedro.multicube.block.BoistestButtonBlock;
import net.pedro.multicube.MulticubeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class MulticubeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MulticubeMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> BOISTEST_WOOD = REGISTRY.register("boistest_wood", () -> new BoistestWoodBlock());
	public static final RegistryObject<Block> BOISTEST_LOG = REGISTRY.register("boistest_log", () -> new BoistestLogBlock());
	public static final RegistryObject<Block> BOISTEST_PLANKS = REGISTRY.register("boistest_planks", () -> new BoistestPlanksBlock());
	public static final RegistryObject<Block> BOISTEST_LEAVES = REGISTRY.register("boistest_leaves", () -> new BoistestLeavesBlock());
	public static final RegistryObject<Block> BOISTEST_STAIRS = REGISTRY.register("boistest_stairs", () -> new BoistestStairsBlock());
	public static final RegistryObject<Block> BOISTEST_SLAB = REGISTRY.register("boistest_slab", () -> new BoistestSlabBlock());
	public static final RegistryObject<Block> BOISTEST_FENCE = REGISTRY.register("boistest_fence", () -> new BoistestFenceBlock());
	public static final RegistryObject<Block> BOISTEST_FENCE_GATE = REGISTRY.register("boistest_fence_gate", () -> new BoistestFenceGateBlock());
	public static final RegistryObject<Block> BOISTEST_PRESSURE_PLATE = REGISTRY.register("boistest_pressure_plate", () -> new BoistestPressurePlateBlock());
	public static final RegistryObject<Block> BOISTEST_BUTTON = REGISTRY.register("boistest_button", () -> new BoistestButtonBlock());
	public static final RegistryObject<Block> D_ORE = REGISTRY.register("d_ore", () -> new DOreBlock());
	public static final RegistryObject<Block> D_BLOCK = REGISTRY.register("d_block", () -> new DBlockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TestBlock.blockColorLoad(event);
		}
	}
}
