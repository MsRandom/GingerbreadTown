package random.gingerbread.main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import random.gingerbread.block.GingerbreadBlocks;
import random.gingerbread.item.GingerbreadItems;
import random.gingerbread.world.gen.feature.GingerbreadFeatures;
import random.gingerbread.world.gen.feature.structure.GingerbreadVillageConfig;

@Mod.EventBusSubscriber(modid = GingerbreadTown.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(GingerbreadBlocks.LIST.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(GingerbreadItems.LIST.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        Biomes.SNOWY_TUNDRA.addStructure(GingerbreadFeatures.VILLAGE, new GingerbreadVillageConfig(4));
    }

    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().register(GingerbreadFeatures.VILLAGE);
    }
}
