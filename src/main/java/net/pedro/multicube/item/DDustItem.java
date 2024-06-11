
package net.pedro.multicube.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DDustItem extends Item {
	public DDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
