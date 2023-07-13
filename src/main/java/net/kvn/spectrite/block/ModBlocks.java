package net.kvn.spectrite.block;

import net.kvn.spectrite.Spectrite;
import net.kvn.spectrite.block.custom.SpectriteChestBlock;
import net.kvn.spectrite.block.custom.SpectriteSimpleBlock;
import net.kvn.spectrite.block.entity.ModBlockEntities;
import net.kvn.spectrite.item.ModCreativeModeTab;
import net.kvn.spectrite.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Spectrite.MOD_ID);

    public static final RegistryObject<Block> SPECTRITE_BLOCK = registerBlock("spectrite_block",
            () -> new SpectriteSimpleBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(50f, 6000f).sound(SoundType.METAL)
                    .lightLevel((state) -> {return 11;})));
    public static final RegistryObject<Block> SPECTRITE_CHEST = registerBlock("spectrite_chest",
            () -> new SpectriteChestBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(50f, 6000f).sound(SoundType.METAL)
                    .lightLevel((state) -> {return 11;})));










    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.SPECTRITE_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
