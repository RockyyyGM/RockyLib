
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package runner.rocky.rockylib.init;

import runner.rocky.rockylib.RockylibMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class RockylibModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RockylibMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ROCKY_LIB = REGISTRY.register("rocky_lib",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rockylib.rocky_lib")).icon(() -> new ItemStack(Blocks.LIGHT_BLUE_BED)).displayItems((parameters, tabData) -> {
				tabData.accept(RockylibModItems.ROCKYLIBB.get());
			}).build());
}
