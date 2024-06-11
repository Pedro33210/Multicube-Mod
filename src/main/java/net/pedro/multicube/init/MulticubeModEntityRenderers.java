
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.client.renderer.EnttestRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MulticubeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MulticubeModEntities.ENTTEST.get(), EnttestRenderer::new);
	}
}
