
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pedro.multicube.init;

import net.pedro.multicube.MulticubeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class MulticubeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MulticubeMod.MODID);
	public static final RegistryObject<SoundEvent> CRABE_RAVE = REGISTRY.register("crabe-rave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("multicube", "crabe-rave")));
}
