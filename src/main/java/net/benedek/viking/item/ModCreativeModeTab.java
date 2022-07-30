package net.benedek.viking.item;

import net.benedek.viking.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab CRAFTING_MATERIAL_TAB = new CreativeModeTab("craftingmaterialtab") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.FIBER.get());


        }

    };

    public static final CreativeModeTab WORKSHOP_TAB = new CreativeModeTab("workshoptab") {
        @Override
        public ItemStack makeIcon() {


            return new ItemStack(ModBlocks.WORKBENCH.get());
        }
    };
}
