package net.ironpnh.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ironpnh.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUTILE_BLOCK = registerBlock("rutile_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BORNITE_BLOCK = registerBlock("bornite_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS)));

    public static final Block COVELLITE_BLOCK = registerBlock("covellite_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f)));

    public static final Block DAMANTITE_BLOCK = registerBlock("damantite_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block HEMATITE_BLOCK = registerBlock("hematite_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f)));

    public static final Block RAW_COVELLITE_BLOCK = registerBlock("raw_covellite_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f)));

    public static final Block RAW_DAMANTITE_BLOCK = registerBlock("raw_damantite_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f)));

    public static final Block RAW_HEMATITE_BLOCK = registerBlock("raw_hematite_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f)));



    public static final Block DEEPSLATE_HEMATITE_ORE_BLOCK = registerBlock("deepslate_hematite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DEEPSLATE_DAMANTITE_ORE_BLOCK = registerBlock("deepslate_damantite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DEEPSLATE_COVELLITE_ORE_BLOCK = registerBlock("deepslate_covellite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.3f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block COVELLITE_ORE_BLOCK = registerBlock("covellite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.2F)));

    public static final Block RUTILE_ORE_BLOCK = registerBlock("rutile_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.2F).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block DEEPSLATE_BORNITE_ORE_BLOCK = registerBlock("deepslate_bornite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(0.2f)));


    public static final Block DEEPSLATE_AETHERIUM_ORE_BLOCK = registerBlock("deepslate_aetherium_ore_block",
            new Block(AbstractBlock.Settings.create().strength(1f)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
