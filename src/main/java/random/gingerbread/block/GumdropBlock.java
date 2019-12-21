package random.gingerbread.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GumdropBlock extends Block {
    public GumdropBlock(GumdropColor color) {
        super(Properties.create(Material.EARTH, color.map).hardnessAndResistance(0.5F).sound(SoundType.GROUND));
        setRegistryName(color.name().toLowerCase() + "_gumdrop");
    }
}
