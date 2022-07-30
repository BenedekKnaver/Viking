package net.benedek.viking.item;

import net.benedek.viking.Viking;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Viking.MOD_ID);

    //item list

    public static final RegistryObject<Item> FIBER = ITEMS.register("fiber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRAFTING_MATERIAL_TAB)));
    public static final RegistryObject<Item> FIBER_STRING = ITEMS.register("fiber_string",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRAFTING_MATERIAL_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
