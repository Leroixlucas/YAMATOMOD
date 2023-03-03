
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dmcyamato.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dmcyamato.item.YamatoItem;
import net.mcreator.dmcyamato.item.VergilSoulItem;
import net.mcreator.dmcyamato.item.TheYamatoItem;
import net.mcreator.dmcyamato.item.DemonSoulFragmentItem;
import net.mcreator.dmcyamato.DmcYamatoMod;

public class DmcYamatoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DmcYamatoMod.MODID);
	public static final RegistryObject<Item> YAMATO = REGISTRY.register("yamato", () -> new YamatoItem());
	public static final RegistryObject<Item> THE_YAMATO = REGISTRY.register("the_yamato", () -> new TheYamatoItem());
	public static final RegistryObject<Item> DEMON_SOUL_FRAGMENT = REGISTRY.register("demon_soul_fragment", () -> new DemonSoulFragmentItem());
	public static final RegistryObject<Item> DEMON_SOUL_FRAGMENT_ORE = block(DmcYamatoModBlocks.DEMON_SOUL_FRAGMENT_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VERGIL_SOUL = REGISTRY.register("vergil_soul", () -> new VergilSoulItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
