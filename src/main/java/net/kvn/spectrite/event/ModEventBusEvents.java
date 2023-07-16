package net.kvn.spectrite.event;


import net.kvn.spectrite.Spectrite;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Spectrite.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerCustomTextures(TextureStitchEvent.Pre event) {
        event.addSprite(new ResourceLocation(Spectrite.MOD_ID, "entity/chest/spectrite"));
        event.addSprite(new ResourceLocation(Spectrite.MOD_ID, "entity/chest/spectrite_left"));
        event.addSprite(new ResourceLocation(Spectrite.MOD_ID, "entity/chest/spectrite_right"));
    }
}
