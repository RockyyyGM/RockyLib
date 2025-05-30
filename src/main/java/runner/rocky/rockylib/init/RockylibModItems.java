
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.rockylib.init;

import runner.rocky.rockylib.item.RockylibbItem;
import runner.rocky.rockylib.RockylibMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class RockylibModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RockylibMod.MODID);
	public static final DeferredItem<Item> ROCKYLIBB = register("rockylibb", RockylibbItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
