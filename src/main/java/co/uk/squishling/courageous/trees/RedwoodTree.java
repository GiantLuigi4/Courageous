package co.uk.squishling.courageous.trees;

import co.uk.squishling.courageous.world.gen.ModFeatures;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class RedwoodTree extends BigTree {

    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return ModFeatures.REDWOOD_TREE;
    }

    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return ModFeatures.GIANT_REDWOOD_TREE;
    }

}