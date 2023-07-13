package net.kvn.spectrite.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.Nullable;

public class SpectriteSimpleBlock extends Block {
    public static final BooleanProperty ODD = BooleanProperty.create("odd");

    public SpectriteSimpleBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(ODD, false));
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos,
                                boolean pIsMoving) {
        if (!pLevel.isClientSide()) {
            pLevel.setBlock(pPos, pState.setValue(ODD, getNewStateFromPos(pPos.getX(), pPos.getY(), pPos.getZ())), 2);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(ODD, getNewStateFromPos(pContext.getClickedPos().getX(),
                pContext.getClickedPos().getY(), pContext.getClickedPos().getZ()));
    }

    private boolean getNewStateFromPos(int x, int y, int z) {
        return ((x + y + z) % 2 == 0);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(ODD);
    }
}
