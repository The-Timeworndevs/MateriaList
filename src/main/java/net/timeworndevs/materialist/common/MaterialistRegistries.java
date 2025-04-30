package net.timeworndevs.materialist.common;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.materialist.Main;
import net.timeworndevs.materialist.helper.MateriaListMassRegister;

public class MaterialistRegistries {
    public static final DeferredRegister.Items ITEM_REGISTRY = DeferredRegister.createItems(Main.MODID);

    public static final DeferredRegister.Blocks BLOCK_REGISTRY = DeferredRegister.createBlocks(Main.MODID);

    public static void registries() {
        MateriaListMassRegister.addRod(ITEM_REGISTRY, "copper"); //registers a Copper Rod only
        MateriaListMassRegister.addSheet(ITEM_REGISTRY, "copper"); //registers a Copper Sheet only

        MateriaListMassRegister.registerAllItems(ITEM_REGISTRY, "bronze"); //registers ALL Item Types for a material

        MateriaListMassRegister.addOre(BLOCK_REGISTRY, "lead"); //registers a Lead Ore only
        MateriaListMassRegister.registerAllBlocks(BLOCK_REGISTRY, "silver"); //registers ALL block types for a material
    }

}
