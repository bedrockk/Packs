package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.recipe.*;
import com.bedrockk.behaviorpacks.json.DefinitionTypeResolverBuilder;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.bedrockk.behaviorpacks.utils.DefinitionIds;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
        @Type(name = DefinitionIds.RECIPE_FURNACE, value = FurnaceRecipeDefinition.class),
        @Type(name = DefinitionIds.RECIPE_SHAPED, value = ShapedRecipeDefinition.class),
        @Type(name = DefinitionIds.RECIPE_SHAPELESS, value = ShapelessRecipeDefinition.class),
        @Type(name = DefinitionIds.RECIPE_BREWING_MIX, value = BrewingMixRecipeDefinition.class),
        @Type(name = DefinitionIds.RECIPE_BREWING_CONTAINER, value = BrewingContainerRecipeDefinition.class)
})
public abstract class VersionedDefinition implements Definition {
    @JsonIgnore
    protected SemVersion formatVersion;

    public @JsonIgnore SemVersion getFormatVersion() {
        return formatVersion;
    }

    public @JsonIgnore void setFormatVersion(SemVersion formatVersion) {
        this.formatVersion = formatVersion;
    }
}
