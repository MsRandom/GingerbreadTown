package random.gingerbread.world.gen.feature.structure;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class GingerbreadVillageConfig implements IFeatureConfig {

    public final int size;

    public GingerbreadVillageConfig(int size) {
        this.size = size;
    }

    public static <T> GingerbreadVillageConfig deserialize(Dynamic<T> p_214679_0_) {
        int i = p_214679_0_.get("size").asInt(6);
        return new GingerbreadVillageConfig(i);
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("size"), ops.createInt(this.size))));
    }
}
