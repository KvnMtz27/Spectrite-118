package net.kvn.spectrite.item;

import net.kvn.spectrite.Spectrite;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Spectrite.MOD_ID);

    public static final RegistryObject<Item> SPECTRITE_GEM = ITEMS.register("spectrite_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_ROD = ITEMS.register("spectrite_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> DIAMOND_ROD = ITEMS.register("diamond_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_BRICK = ITEMS.register("spectrite_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_BONE = ITEMS.register("spectrite_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_DUST = ITEMS.register("spectrite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_BLAZE_ROD = ITEMS.register("spectrite_blaze_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    public static final RegistryObject<Item> SPECTRITE_BLAZE_POWDER = ITEMS.register("spectrite_blaze_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
