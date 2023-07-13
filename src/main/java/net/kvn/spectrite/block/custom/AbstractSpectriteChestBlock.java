package net.kvn.spectrite.block.custom;

import net.kvn.spectrite.block.entity.SpectriteChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public abstract class AbstractSpectriteChestBlock<E extends BlockEntity> extends BaseEntityBlock {
    protected final Supplier<BlockEntityType<? extends E>> blockEntityType;

    protected AbstractSpectriteChestBlock(BlockBehaviour.Properties pProperties, Supplier<BlockEntityType<? extends E>> pBlockEntityType) {
        super(pProperties);
        this.blockEntityType = pBlockEntityType;
    }

    public abstract DoubleBlockCombiner.NeighborCombineResult<? extends SpectriteChestBlockEntity> combine(BlockState pState, Level pLevel, BlockPos pPos, boolean pOverride);
}
