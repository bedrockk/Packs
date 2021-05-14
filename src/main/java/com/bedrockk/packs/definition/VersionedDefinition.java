package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.feature.*;
import com.bedrockk.packs.definition.recipe.*;
import com.bedrockk.packs.json.DefinitionTypeResolverBuilder;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.DefinitionIds;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(DefinitionTypeResolverBuilder.class)
@JsonSubTypes({
		@Type(name = DefinitionIds.BLOCK, value = BlockDefinition.class),
		@Type(name = DefinitionIds.ITEM, value = ItemDefinition.class),
		@Type(name = DefinitionIds.ENTITY, value = EntityDefinition.class),
		@Type(name = DefinitionIds.TEXTURE_SET, value = TextureSetDefinition.class),
		@Type(name = DefinitionIds.RECIPE_FURNACE, value = FurnaceRecipeDefinition.class),
		@Type(name = DefinitionIds.RECIPE_SHAPED, value = ShapedRecipeDefinition.class),
		@Type(name = DefinitionIds.RECIPE_SHAPELESS, value = ShapelessRecipeDefinition.class),
		@Type(name = DefinitionIds.RECIPE_BREWING_MIX, value = BrewingMixRecipeDefinition.class),
		@Type(name = DefinitionIds.RECIPE_BREWING_CONTAINER, value = BrewingContainerRecipeDefinition.class),
		@Type(name = DefinitionIds.FEATURE_RULES, value = FeatureRuleDefinition.class),
		@Type(name = DefinitionIds.FEATURE_AGGREGATE, value = AggregateFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_CAVE_CARVER, value = CaveCarverFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_GROWING_PLANT, value = GrowingPlantFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_HELL_CAVE_CARVER, value = HellCaveCarverFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_ORE, value = OreFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_SCATTER, value = ScatterFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_SEARCH, value = SearchFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_SEQUENCE, value = SequenceFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_SINGLE_BLOCK, value = SingleBlockFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_SNAP_TO_SURFACE, value = SnapToSurfaceFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_STRUCTURE_TEMPLATE, value = StructureTemplateFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_TREE, value = TreeFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_UNDERWATER_CAVE_CARVER, value = UnderwaterCaveCarverFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_WEIGHTED_RANDOM, value = WeightedRandomFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_BEARDS_AND_SHAVERS, value = BeardsAndShaversFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_CONDITIONAL_LIST, value = ConditionalListFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_GEODE, value = GeodeFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_MULTIFACE, value = MultiFaceFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_RECT_LAYOUT, value = RectLayoutFeatureDefinition.class),
		@Type(name = DefinitionIds.FEATURE_VEGETATION_PATCH, value = VegetationPatchFeatureDefinition.class),
})
public abstract class VersionedDefinition implements VersionedNode, Definition {
	@JsonIgnore
	protected SemVersion formatVersion;

	public @JsonIgnore
	SemVersion getFormatVersion() {
		return formatVersion;
	}

	public @JsonIgnore
	void setFormatVersion(SemVersion formatVersion) {
		this.formatVersion = formatVersion;
	}
}
