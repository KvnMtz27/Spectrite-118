package net.kvn.spectrite;

import com.mojang.logging.LogUtils;
import net.kvn.spectrite.block.ModBlocks;
import net.kvn.spectrite.block.entity.ModBlockEntities;
import net.kvn.spectrite.item.ModItems;
import net.kvn.spectrite.renderer.blockentity.SpectriteChestRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.stream.Collectors;


@Mod(Spectrite.MOD_ID)
public class Spectrite {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "spectrite";

    public Spectrite() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BlockEntityRenderers.register(ModBlockEntities.SPECTRITE_CHEST.get(), SpectriteChestRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
