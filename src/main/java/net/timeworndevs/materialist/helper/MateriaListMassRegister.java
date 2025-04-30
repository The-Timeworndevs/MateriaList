package net.timeworndevs.materialist.helper;


import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MateriaListMassRegister {


    public static void registerAllItems(DeferredRegister.Items defreg,String base) {
        addRod(defreg, base);
        addSheet(defreg, base);
        //etc...

    }

    public static void addRod(DeferredRegister.Items defreg, String base) {
        defreg.registerSimpleItem(base + "_rod");
    }

    public static void addSheet(DeferredRegister.Items defreg, String base) {

        defreg.registerSimpleItem(base + "_sheet");
    }

    public static void registerAllBlocks(DeferredRegister.Blocks defreg, String base) {
        addOre(defreg, base);
        addStorageBlock(defreg, base);
    }

    public static void addOre(DeferredRegister.Blocks defreg, String base) {
        defreg.registerSimpleBlock(base + "_ore", BlockBehaviour.Properties.of());
    }
    public static void addStorageBlock(DeferredRegister.Blocks defreg, String base) {
        defreg.registerSimpleBlock("block_of_" + base, BlockBehaviour.Properties.of());
    }
}
