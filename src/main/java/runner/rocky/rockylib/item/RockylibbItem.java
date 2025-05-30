
package runner.rocky.rockylib.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RockylibbItem extends Item {
	public RockylibbItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
