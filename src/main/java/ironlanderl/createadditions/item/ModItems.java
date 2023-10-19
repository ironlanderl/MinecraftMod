package ironlanderl.createadditions.item;

import ironlanderl.createadditions.CreateAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TEST_ITEM2 = registerItem("test_item2",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(CreateAdditions.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
        CreateAdditions.LOGGER.info("Registering items");
    }
}
