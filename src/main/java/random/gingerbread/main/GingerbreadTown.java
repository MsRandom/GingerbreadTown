package random.gingerbread.main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import random.gingerbread.block.GingerbreadBlocks;

@Mod(GingerbreadTown.MOD_ID)
public class GingerbreadTown {

    public static final String MOD_ID = "gingerbread";
    public static final ItemGroup ITEM_GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(GingerbreadBlocks.GINGERBREAD_BRICKS);
        }
    };

    public static Item.Properties makeProperties() {
        return new Item.Properties().group(ITEM_GROUP);
    }
}
