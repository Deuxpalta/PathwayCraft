package com.pathway.pathwaymod.item;

import com.pathway.pathwaymod.PathwayCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PathwayCraft.MOD_ID);

    public static final DeferredItem<Item> MURLOC_SCALE =ITEMS.registerSimpleItem("murloc_scale");
    public static final DeferredItem<Item> CONCH =ITEMS.registerSimpleItem("conch");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
