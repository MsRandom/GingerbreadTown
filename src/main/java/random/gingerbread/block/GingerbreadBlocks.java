package random.gingerbread.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import random.gingerbread.item.GingerbreadItems;
import random.gingerbread.main.GingerbreadTown;

import java.lang.reflect.Field;
import java.util.*;

public class GingerbreadBlocks {

    public static final List<Block> LIST = new ArrayList<>();
    public static final Map<GumdropColor, GumdropBlock> GUMDROPS = new HashMap<>();
    public static final Block GINGERBREAD_DOOR = new GingerbreadDoorBlock();
    public static final Block GINGERBREAD_BLOCK = new Block(Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("gingerbread_blocks");
    public static final Block GINGERBREAD_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 6.0F).sound(SoundType.STONE)).setRegistryName("gingerbread_bricks");

    static {
        Item.Properties properties = GingerbreadTown.makeProperties();
        for (GumdropColor color : GumdropColor.values()) {
            GumdropBlock block = new GumdropBlock(color);
            LIST.add(block);
            GUMDROPS.put(color, block);
        }
        try {
            for (Field field : GingerbreadBlocks.class.getFields()) {
                if (field.getType().isAssignableFrom(Block.class)) {
                    Block block = (Block) field.get(null);
                    LIST.add(block);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        for (Block block : LIST)
            GingerbreadItems.LIST.add(new BlockItem(block, properties).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }
}
