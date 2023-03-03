
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dmcyamato.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dmcyamato.world.features.ores.DemonSoulFragmentOreFeature;
import net.mcreator.dmcyamato.DmcYamatoMod;

@Mod.EventBusSubscriber
public class DmcYamatoModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DmcYamatoMod.MODID);
	public static final RegistryObject<Feature<?>> DEMON_SOUL_FRAGMENT_ORE = REGISTRY.register("demon_soul_fragment_ore",
			DemonSoulFragmentOreFeature::feature);
}
