
package net.mcreator.dmcyamato.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DemonSoulFragmentItem extends Item {
	public DemonSoulFragmentItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(12).fireResistant().rarity(Rarity.EPIC));
	}
}
