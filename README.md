# MateriaList: Every material in one place.

This mod aims to add nearly every material used by most mods in one cohesive project, as well as shoring up a few loose ends.

Unlike most mods, every texture is hand-made instead of generated, and if anyone wants to add their own material, there is a built-in API to do so!

---
# For developers using the MaterialList API:

A following use of the API is as follows

````java

import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.materialist.Main;
import net.timeworndevs.materialist.helper.MateriaListMassRegister;

public class ExampleRegistries {
    public static final DeferredRegister.Items ITEM_REGISTRY = DeferredRegister.createItems("example");

    public static final DeferredRegister.Blocks BLOCK_REGISTRY = DeferredRegister.createBlocks("example");
    
    public static void testRegistries() {
        MateriaListMassRegister.addRod(ITEM_REGISTRY, "copper"); //registers a Copper Rod only
        MateriaListMassRegister.addSheet(ITEM_REGISTRY, "copper"); //registers a Copper Sheet only

        MateriaListMassRegister.registerAllItems(ITEM_REGISTRY, "bronze"); //registers ALL Item Types for a material

        MateriaListMassRegister.addOre(BLOCK_REGISTRY, "lead"); //registers a Lead Ore only
        MateriaListMassRegister.registerAllBlocks(BLOCK_REGISTRY, "silver"); //registers ALL block types for a material
    }

}

````

Don't forget to add this to your mod initializer!

````java
public Main(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        ExampleRegistries.ITEM_REGISTRY.register(modEventBus);
        ExampleRegistries.BLOCK_REGISTRY.register(modEventBus);
        ExampleRegistries.testRegistries();
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
````
