package net.kvn.spectrite.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SPECTRITE_TAB = new CreativeModeTab("spectritetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SPECTRITE_GEM.get());
        }

        /*@Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            List<Item> items = Arrays.asList(
                    ModBlocks.COBALT_ORE.get().asItem(),
                    ModBlocks.DEEPSLATE_COBALT_ORE.get().asItem(),
                    ModBlocks.RAW_COBALT_BLOCK.get().asItem(),
                    ModBlocks.COBALT_BLOCK.get().asItem(),
                    ModBlocks.COBALT_STAIRS.get().asItem(),
                    ModBlocks.COBALT_SLAB.get().asItem(),
                    ModBlocks.COBALT_BUTTON.get().asItem(),
                    ModBlocks.COBALT_PRESSURE_PLATE.get().asItem(),
                    ModBlocks.COBALT_FENCE.get().asItem(),
                    ModBlocks.COBALT_FENCE_GATE.get().asItem(),
                    ModBlocks.COBALT_WALL.get().asItem(),
                    ModBlocks.SPEEDY_BLOCK.get().asItem(),
                    ModBlocks.CHERRY_BLOSSOM_DOOR.get().asItem(),
                    ModBlocks.CHERRY_BLOSSOM_TRAPDOOR.get().asItem(),
                    ModBlocks.COBALT_LAMP.get().asItem(),
                    ModItems.RAW_COBALT.get().asItem(),
                    ModItems.COBALT_INGOT.get().asItem(),
                    ModItems.COBALT_NUGGET.get().asItem(),
                    ModItems.COBALT_BOW.get().asItem(),
                    ModItems.COBALT_SWORD.get().asItem(),
                    ModItems.COBALT_PICKAXE.get().asItem(),
                    ModItems.COBALT_AXE.get().asItem(),
                    ModItems.COBALT_SHOVEL.get().asItem(),
                    ModItems.COBALT_HOE.get().asItem(),
                    ModItems.COBALT_PAXEL.get().asItem(),
                    ModItems.COBALT_HELMET.get().asItem(),
                    ModItems.COBALT_CHESTPLATE.get().asItem(),
                    ModItems.COBALT_LEGGINGS.get().asItem(),
                    ModItems.COBALT_BOOTS.get().asItem(),
                    ModItems.COBALT_HORSE_ARMOR.get().asItem(),
                    ModItems.DOWSING_ROD.get().asItem(),
                    ModItems.COAL_SLIVER.get().asItem(),
                    ModItems.TURNIP.get().asItem(),
                    ModItems.TURNIP_SEEDS.get().asItem(),
                    ModItems.DATA_TABLET.get().asItem(),
                    ModBlocks.PINK_ROSE.get().asItem(),
                    ModItems.BAR_BRAWL_RECORD.get().asItem(),
                    ModBlocks.COBALT_BLASTER.get().asItem(),
                    ModItems.COBALT_STAFF.get().asItem(),
                    ModItems.HONEY_BUCKET.get().asItem()
            );
            super.fillItemList(pItems);
            pItems.sort(Ordering.explicit(items).onResultOf(ItemStack::getItem));
        }*/
    };
}
