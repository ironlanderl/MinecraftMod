package ironlanderl.createadditions.block;

import ironlanderl.createadditions.CreateAdditions;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class TestBlockEntity extends BlockEntity {
    public TestBlockEntity(BlockPos pos, BlockState state) {
        super(CreateAdditions.TEST_BLOCK_ENTITY, pos, state);
    }
}