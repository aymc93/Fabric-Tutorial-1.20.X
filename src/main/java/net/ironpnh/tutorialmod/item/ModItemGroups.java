package net.ironpnh.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ironpnh.tutorialmod.TutorialMod;
import net.ironpnh.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUTILE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "rutile"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rutile"))
                .icon(() -> new ItemStack(ModItems.RUTILE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUTILE);
                    entries.add(ModItems.BORNITE);
                    entries.add(ModItems.COVELLITE);
                    entries.add(ModItems.RAW_COVELLITE);
                    entries.add(ModItems.DAMANTITE);
                    entries.add(ModItems.RAW_DAMANTITE);
                    entries.add(ModItems.HEMATITE);
                    entries.add(ModItems.RAW_HEMATITE);

                    entries.add(ModBlocks.RUTILE_BLOCK);
                    entries.add(ModBlocks.BORNITE_BLOCK);
                    entries.add(ModBlocks.COVELLITE_BLOCK);
                    entries.add(ModBlocks.RAW_COVELLITE_BLOCK);
                    entries.add(ModBlocks.DAMANTITE_BLOCK);
                    entries.add(ModBlocks.RAW_DAMANTITE_BLOCK);
                    entries.add(ModBlocks.HEMATITE_BLOCK);
                    entries.add(ModBlocks.RAW_HEMATITE_BLOCK);

                    entries.add(ModBlocks.DEEPSLATE_BORNITE_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_COVELLITE_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_DAMANTITE_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_HEMATITE_ORE_BLOCK);
                    entries.add(ModBlocks.RUTILE_ORE_BLOCK);
                    entries.add(ModBlocks.COVELLITE_ORE_BLOCK);

                    entries.add(ModBlocks.DEEPSLATE_AETHERIUM_ORE_BLOCK);

                    entries.add(ModItems.CENDRESOL);
                    entries.add(ModItems.ECLIPSIUM);
                    entries.add(ModItems.EUCHRYTE);
                    entries.add(ModItems.NOCTYRIUM);
                    entries.add(ModItems.SOMBRELIUM);

                    entries.add(ModItems.AETHERIUM);
                }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " +TutorialMod.MOD_ID);
    }
}
