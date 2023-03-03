
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dmcyamato.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dmcyamato.block.DemonSoulFragmentOreBlock;
import net.mcreator.dmcyamato.DmcYamatoMod;

public class DmcYamatoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DmcYamatoMod.MODID);
	public static final RegistryObject<Block> DEMON_SOUL_FRAGMENT_ORE = REGISTRY.register("demon_soul_fragment_ore",
			() -> new DemonSoulFragmentOreBlock());
}
