package ironlanderl.createadditions.block;

import ironlanderl.createadditions.CreateAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.of(Material.METAL).breakInstantly()), ItemGroup.MISC);

    public static final BlockEntityType<TestBlockEntity> DEMO_BLOCK_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("tutorial", "demo_block_entity"),
            FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build()
    );

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CreateAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(CreateAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void RegisterModBlocks(){
        CreateAdditions.LOGGER.info("Registered blocks");
    }
}
