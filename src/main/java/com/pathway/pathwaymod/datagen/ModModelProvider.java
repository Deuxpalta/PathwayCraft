package com.pathway.pathwaymod.datagen;

import com.pathway.pathwaymod.PathwayCraft;
import com.pathway.pathwaymod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, PathwayCraft.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.MURLOC_SCALE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CONCH.get(), ModelTemplates.FLAT_ITEM);
    }
}
