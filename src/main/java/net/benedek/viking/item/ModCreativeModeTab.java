package net.benedek.viking.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab CRAFTING_MATERIAL_TAB = new CreativeModeTab("craftingmaterialtab") {
        @Override
        public ItemStack makeIcon() {

            //item list

            return new ItemStack(ModItems.FIBER.get());

        }
    };
}
