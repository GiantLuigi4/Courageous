package du.squishling.courageous.blocks;

import du.squishling.courageous.blocks.vegetation.*;
import du.squishling.courageous.items.ModItems;
import du.squishling.courageous.trees.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;

public class ModBlocks {

    public static ArrayList<Block> BLOCKS = new ArrayList<Block>();

    public static final Block WEATHERED_BRICK = new BlockBase("weathered_brick", Material.ROCK);

    public static final Block PALM_SAPLING = new CustomSapling("palm_sapling", new PalmTree());
    public static final Block PALM_LEAVES = new CustomLeaves("palm_leaves", new BlockItem(PALM_SAPLING, new Item.Properties()));
    public static final Block PALM_LOG = new CustomLog("palm_log", MaterialColor.SAND);
    public static final Block PALM_PLANKS = new CustomPlanks("palm_planks");

    public static final Block ALPINE_SAPLING = new CustomSapling("alpine_sapling", new AlpineTree());
    public static final Block ALPINE_LEAVES = new CustomLeaves("alpine_leaves", new BlockItem(ALPINE_SAPLING, new Item.Properties()));

    public static final Block PEAR_SAPLING = new CustomSapling("pear_sapling", new PearTree());
    public static final Block PEAR_LEAVES = new HarvestableLeaves("pear_leaves", ModItems.PEAR).setMinMax(1, 2);

    public static final Block APPLE_SAPLING = new CustomSapling("apple_sapling", new PearTree());
    public static final Block APPLE_LEAVES = new HarvestableLeaves("apple_leaves", Items.APPLE).setMinMax(1, 2);

    public static final Block KIWI_FRUIT_SAPLING = new CustomSapling("kiwi_fruit_sapling", new PearTree());
    public static final Block KIWI_FRUIT_LEAVES = new HarvestableLeaves("kiwi_fruit_leaves", ModItems.KIWI_FRUIT).setMinMax(1, 2);

    public static final Block LEMON_SAPLING = new CustomSapling("lemon_sapling", new PearTree());
    public static final Block LEMON_LEAVES = new HarvestableLeaves("lemon_leaves", ModItems.LEMON).setMinMax(1, 2);

    public static final Block AVOCADO_SAPLING = new CustomSapling("avocado_sapling", new PearTree());
    public static final Block AVOCADO_LEAVES = new HarvestableLeaves("avocado_leaves", ModItems.AVOCADO).setMinMax(1, 2);

    public static final Block PLUM_SAPLING = new CustomSapling("plum_sapling", new PearTree());
    public static final Block PLUM_LEAVES = new HarvestableLeaves("plum_leaves", ModItems.PLUM).setMinMax(1, 2);

    public static final Block ORANGE_SAPLING = new CustomSapling("orange_sapling", new OrangeTree());
    public static final Block ORANGE_LEAVES = new HarvestableLeaves("orange_leaves", ModItems.ORANGE).setMinMax(1, 2);

    public static final Block MAPLE_SAPLING = new CustomSapling("maple_sapling", new MapleTree());
    public static final Block MAPLE_LEAVES = new CustomLeaves("maple_leaves");
    public static final Block MAPLE_LOG = new CustomLog("maple_log", MaterialColor.BROWN);
    public static final Block MAPLE_LOG_SYRUP = new MapleLog("maple_log_syrup", MaterialColor.BROWN);
    public static final Block MAPLE_PLANKS = new CustomPlanks("maple_planks");

    public static final Block DESERT_SHRUB = new CustomBush("desert_shrub", Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 16.0D, 13.0D, 14.0D), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.SAND, Blocks.RED_SAND);

}
