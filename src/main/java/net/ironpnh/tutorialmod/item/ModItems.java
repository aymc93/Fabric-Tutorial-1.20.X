package net.ironpnh.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ironpnh.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUTILE = registerItem("rutile", new Item(new FabricItemSettings()));
    public static final Item BORNITE = registerItem("bornite", new Item(new FabricItemSettings()));
    public static final Item HEMATITE = registerItem("hematite", new Item(new FabricItemSettings()));
    public static final Item RAW_HEMATITE = registerItem("raw_hematite", new Item(new FabricItemSettings()));
    public static final Item COVELLITE = registerItem("covellite", new Item(new FabricItemSettings()));
    public static final Item RAW_COVELLITE = registerItem("raw_covellite", new Item(new FabricItemSettings()));
    public static final Item DAMANTITE = registerItem("damantite", new Item(new FabricItemSettings()));
    public static final Item RAW_DAMANTITE = registerItem("raw_damantite", new Item(new FabricItemSettings()));
    public static final Item CENDRESOL = registerItem("cendresol", new Item(new FabricItemSettings()));
    public static final Item ECLIPSIUM = registerItem("eclipsium", new Item(new FabricItemSettings()));
    public static final Item EUCHRYTE = registerItem("euchryte", new Item(new FabricItemSettings()));
    public static final Item NOCTYRIUM = registerItem("noctyrium", new Item(new FabricItemSettings()));
    public static final Item SOMBRELIUM = registerItem("sombrelium", new Item(new FabricItemSettings()));
    public static final Item AETHERIUM = registerItem("aetherium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUTILE);
        entries.add(BORNITE);
        entries.add(HEMATITE);
        entries.add(RAW_HEMATITE);
        entries.add(COVELLITE);
        entries.add(RAW_COVELLITE);
        entries.add(DAMANTITE);
        entries.add(RAW_DAMANTITE);

        entries.add(CENDRESOL);
        entries.add(ECLIPSIUM);
        entries.add(EUCHRYTE);
        entries.add(NOCTYRIUM);
        entries.add(SOMBRELIUM);

        entries.add(AETHERIUM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
