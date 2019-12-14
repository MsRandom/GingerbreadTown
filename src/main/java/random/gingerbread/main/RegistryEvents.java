package random.gingerbread.main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import random.gingerbread.block.GingerbreadBlocks;
import random.gingerbread.item.GingerbreadItems;

@Mod.EventBusSubscriber(modid = GingerbreadTown.MOD_ID)
public class RegistryEvents {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(GingerbreadBlocks.LIST.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(GingerbreadItems.LIST.toArray(new Item[0]));
    }
}
