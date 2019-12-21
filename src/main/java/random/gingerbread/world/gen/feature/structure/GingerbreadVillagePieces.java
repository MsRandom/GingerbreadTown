package random.gingerbread.world.gen.feature.structure;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.SingleJigsawPiece;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.*;
import random.gingerbread.main.GingerbreadTown;

import java.util.Arrays;
import java.util.List;

public class GingerbreadVillagePieces {

    public static void register(ChunkGenerator<?> p_214838_0_, TemplateManager p_214838_1_, BlockPos p_214838_2_, List<StructurePiece> p_214838_3_, SharedSeedRandom p_214838_4_, NoFeatureConfig p_214838_5_) {
        ResourceLocation empty = new ResourceLocation("empty");
        ResourceLocation start = new ResourceLocation(GingerbreadTown.MOD_ID, "gingerbread_villages/town_centers");
        ImmutableList<StructureProcessor> rules = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()))));
        ImmutableList<StructureProcessor> none = ImmutableList.of();
        JigsawManager.field_214891_a.register(new JigsawPattern(start, empty, Arrays.asList(new Pair<>(new SingleJigsawPiece("gingerbread_villages/town_centers/town_center", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 2), new Pair<>(new SingleJigsawPiece("gingerbread_villages/town_centers/town_center", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation(GingerbreadTown.MOD_ID, "gingerbread_villages/houses"), empty, Arrays.asList(new Pair<>(new SingleJigsawPiece("gingerbread_villages/houses/small_house_1", rules, JigsawPattern.PlacementBehaviour.RIGID), 4), new Pair<>(new SingleJigsawPiece("gingerbread_villages/houses/medium_house", rules, JigsawPattern.PlacementBehaviour.RIGID), 3)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation(GingerbreadTown.MOD_ID, "gingerbread_villages/streets"), empty, Arrays.asList(new Pair<>(new SingleJigsawPiece("gingerbread_villages/streets/path_cross", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 3), new Pair<>(new SingleJigsawPiece("gingerbread_villages/streets/path_corner", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 4), new Pair<>(new SingleJigsawPiece("gingerbread_villages/streets/path_t", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 4), new Pair<>(new SingleJigsawPiece("gingerbread_villages/streets/path_straight_long", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 6), new Pair<>(new SingleJigsawPiece("gingerbread_villages/streets/path_straight_short", none, JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING), 7)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation(GingerbreadTown.MOD_ID, "gingerbread_villages/decor"), empty, Arrays.asList(new Pair<>(new SingleJigsawPiece("gingerbread_villages/lamp_1", none, JigsawPattern.PlacementBehaviour.RIGID), 2), new Pair<>(new SingleJigsawPiece("gingerbread_villages/lamp_2", none, JigsawPattern.PlacementBehaviour.RIGID), 2), new Pair<>(new SingleJigsawPiece("gingerbread_villages/lamp_3", none, JigsawPattern.PlacementBehaviour.RIGID), 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.func_214889_a(start, 4, Village::new, p_214838_0_, p_214838_1_, p_214838_2_, p_214838_3_, p_214838_4_);
    }

    public static class Village extends AbstractVillagePiece {
        public Village(TemplateManager p_i50890_1_, JigsawPiece p_i50890_2_, BlockPos p_i50890_3_, int p_i50890_4_, Rotation p_i50890_5_, MutableBoundingBox p_i50890_6_) {
            super(GingerbreadVillagePieces.Village::new, p_i50890_1_, p_i50890_2_, p_i50890_3_, p_i50890_4_, p_i50890_5_, p_i50890_6_);
        }

        public Village(TemplateManager p_i50891_1_, CompoundNBT p_i50891_2_) {
            super(p_i50891_1_, p_i50891_2_, GingerbreadVillagePieces.Village::new);
        }
    }
}
