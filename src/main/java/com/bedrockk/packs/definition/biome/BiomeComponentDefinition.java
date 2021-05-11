package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.json.NamedTypeResolverBuilder;
import com.bedrockk.packs.utils.BiomeComponentIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
		@Type(name = BiomeComponentIds.IGNORE_AUTOMATIC_FEATURES, value = IgnoreAutomaticFeaturesDefinition.class),
		@Type(name = BiomeComponentIds.CLIMATE, value = ClimateDefinition.class),
		@Type(name = BiomeComponentIds.NETHER_GENERATION_RULES, value = NetherGenerationRulesDefinition.class),
		@Type(name = BiomeComponentIds.OVERWORLD_HEIGHT, value = OverworldHeightDefinition.class),
		@Type(name = BiomeComponentIds.SURFACE_PARAMETERS, value = SurfaceParametersDefinition.class),
		@Type(name = BiomeComponentIds.SWAMP_SURFACE, value = SwampSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.FROZEN_OCEAN_SURFACE, value = FrozenOceanSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.CAPPED_SURFACE, value = CappedSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.MESA_SURFACE, value = MesaSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.THE_END_SURFACE, value = TheEndSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.NETHER_SURFACE, value = NetherSurfaceDefinition.class),
		@Type(name = BiomeComponentIds.OVERWORLD_GENERATION_RULES, value = OverworldGenerationRulesDefinition.class),
		@Type(name = BiomeComponentIds.SURFACE_MATERIAL_ADJUSTMENTS, value = SurfaceMaterialAdjustmentsDefinition.class),
		@Type(name = BiomeComponentIds.FORCED_FEATURES, value = ForcedFeaturesDefinition.class),
		@Type(name = BiomeComponentIds.MOUNTAIN_PARAMETERS, value = MountainParametersDefinition.class),
		@Type(name = BiomeComponentIds.LEGACY_WORLD_GENERATION_RULES, value = LegacyWorldGenerationRulesDefinition.class),
		@Type(name = BiomeComponentIds.MULTI_NOISE_GENERATION_RULES, value = MultiNoiseGenerationRulesDefinition.class),
})
public interface BiomeComponentDefinition extends Definition {
}
