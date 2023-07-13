package net.kvn.spectrite.block.entity;

import net.kvn.spectrite.Spectrite;
import net.kvn.spectrite.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Spectrite.MOD_ID);

    public static final RegistryObject<BlockEntityType<SpectriteChestBlockEntity>> SPECTRITE_CHEST =
            BLOCK_ENTITIES.register("spectrite_chest", () ->
                    BlockEntityType.Builder.of(SpectriteChestBlockEntity::new,
                            ModBlocks.SPECTRITE_CHEST.get()).build(null));






    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
