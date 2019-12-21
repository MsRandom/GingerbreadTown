package random.gingerbread.world.gen.feature;

import net.minecraft.world.gen.feature.structure.Structure;
import random.gingerbread.world.gen.feature.structure.GingerbreadVillageConfig;
import random.gingerbread.world.gen.feature.structure.GingerbreadVillageStructure;

public class GingerbreadFeatures {

    public static final Structure<GingerbreadVillageConfig> VILLAGE = new GingerbreadVillageStructure(GingerbreadVillageConfig::deserialize);
}
