package random.gingerbread.world.gen.feature;

import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import random.gingerbread.world.gen.feature.structure.GingerbreadVillageStructure;

public class GingerbreadFeatures {

    public static final Structure<NoFeatureConfig> VILLAGE = new GingerbreadVillageStructure(NoFeatureConfig::deserialize);
}
