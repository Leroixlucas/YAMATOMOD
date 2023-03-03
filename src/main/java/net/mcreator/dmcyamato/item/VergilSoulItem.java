
package net.mcreator.dmcyamato.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class VergilSoulItem extends Item {
	public VergilSoulItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
