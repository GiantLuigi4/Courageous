package co.uk.squishling.courageous.world.gen.biomes;

import co.uk.squishling.courageous.blocks.ModBlocks;
import co.uk.squishling.courageous.world.gen.ModFeatures;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class BiomeWetlands extends Biome {

    public BiomeWetlands() {
        super(new Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                .category(Category.SWAMP)
                .precipitation(RainType.RAIN)
                .downfall(0.9F)

                .temperature(0.8F)

                .depth(-0.2F)
                .scale(0.1F)

                .waterColor(0x64abfb)
                .waterFogColor(0x64c2fb)

                .parent((String) null));

        DefaultBiomeFeatures.addSedimentDisks(this);
        DefaultBiomeFeatures.addStructures(this);

        ModFeatures.addUndergroundFeatures(this);
        ModFeatures.addMudLake(this, 1);
        ModFeatures.addMudLake(this, 2);
        ModFeatures.addSwampDecoration(this);

        ModFeatures.addSeaPlant(this, ModFeatures.BULRUSHES);
        ModFeatures.addDoublePlant(this, ModBlocks.BULRUSHES.getDefaultState(), 190);

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 1, 1, 1));
    }

    @Override
    public int getGrassColor(double p_225528_1_, double p_225528_3_) {
        return 0x53b65f;
    }
}
