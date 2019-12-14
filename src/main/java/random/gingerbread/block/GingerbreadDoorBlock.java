package random.gingerbread.block;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class GingerbreadDoorBlock extends DoorBlock {
    protected GingerbreadDoorBlock() {
        super(Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(3.0F).sound(SoundType.WOOD));
        setRegistryName("gingerbread_door");
    }
}
