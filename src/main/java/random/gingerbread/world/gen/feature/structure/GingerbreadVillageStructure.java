package random.gingerbread.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.MarginedStructureStart;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.template.TemplateManager;
import random.gingerbread.main.GingerbreadTown;
import random.gingerbread.world.gen.feature.GingerbreadFeatures;

import java.util.Random;
import java.util.function.Function;

public class GingerbreadVillageStructure extends Structure<GingerbreadVillageConfig> {

    public GingerbreadVillageStructure(Function<Dynamic<?>, ? extends GingerbreadVillageConfig> p_i51427_1_) {
        super(p_i51427_1_);
        setRegistryName("gingerbread_village");
    }

    public boolean hasStartAt(ChunkGenerator<?> chunkGen, Random rand, int chunkPosX, int chunkPosZ) {
        ChunkPos chunkpos = this.getStartPositionForPosition(chunkGen, rand, chunkPosX, chunkPosZ, 0, 0);
        if (chunkPosX == chunkpos.x && chunkPosZ == chunkpos.z) {
            Biome biome = chunkGen.getBiomeProvider().getBiome(new BlockPos((chunkPosX << 4) + 9, 0, (chunkPosZ << 4) + 9));
            return chunkGen.hasStructure(biome, GingerbreadFeatures.VILLAGE);
        } else {
            return false;
        }
    }

    public Structure.IStartFactory getStartFactory() {
        return Start::new;
    }

    public String getStructureName() {
        return GingerbreadTown.MOD_ID + ":GingerbreadVillage";
    }

    public int getSize() {
        return 8;
    }

    public static class Start extends MarginedStructureStart {
        public Start(Structure<?> p_i51110_1_, int p_i51110_2_, int p_i51110_3_, Biome p_i51110_4_, MutableBoundingBox p_i51110_5_, int p_i51110_6_, long p_i51110_7_) {
            super(p_i51110_1_, p_i51110_2_, p_i51110_3_, p_i51110_4_, p_i51110_5_, p_i51110_6_, p_i51110_7_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
            GingerbreadVillageConfig villageconfig = generator.getStructureConfig(biomeIn, GingerbreadFeatures.VILLAGE);
            BlockPos blockpos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
            GingerbreadVillagePieces.register(generator, templateManagerIn, blockpos, this.components, this.rand, villageconfig);
            System.out.println(blockpos);
            this.recalculateStructureSize();
        }
    }
}
