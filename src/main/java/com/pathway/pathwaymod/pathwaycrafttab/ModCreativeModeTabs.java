package com.pathway.pathwaymod.pathwaycrafttab;

import com.pathway.pathwaymod.PathwayCraft;
import com.pathway.pathwaymod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PathwayCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> POTION_INGREDIENTS = CREATIVE_MODE_TABS.register("potion_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CONCH.get()))
                    .title(Component.translatable("creativetab.pathwaymod.potion_ingredients"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CONCH);
                        output.accept(ModItems.MURLOC_SCALE);
                    })

            .build());

    public static final Supplier<CreativeModeTab> PATHWAY_BLOCKS = CREATIVE_MODE_TABS.register("pathway_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CONCH.get()))
                    .title(Component.translatable("creativetab.pathwaymod.pathway_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
