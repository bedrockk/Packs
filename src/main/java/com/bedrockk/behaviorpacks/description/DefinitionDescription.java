package com.bedrockk.behaviorpacks.description;

import com.bedrockk.behaviorpacks.description.definition.*;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.bedrockk.behaviorpacks.utils.DefinitionDescriptionIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
		@Type(name = DefinitionDescriptionIds.IDENTIFIER, value = IdentifierDescription.class),
		@Type(name = DefinitionDescriptionIds.IS_EXPERIMENTAL, value = IsExperimentalDescription.class),
		@Type(name = DefinitionDescriptionIds.IS_SPAWNABLE, value = IsSpawnableDescription.class),
		@Type(name = DefinitionDescriptionIds.IS_SUMMONABLE, value = IsSummonableDescription.class),
		@Type(name = DefinitionDescriptionIds.RUNTIME_IDENTIFIER, value = RuntimeIdentifierDescription.class),
		@Type(name = DefinitionDescriptionIds.ANIMATIONS, value = AnimationsDescription.class),
		@Type(name = DefinitionDescriptionIds.SCRIPTS, value = AnimationScriptsDescription.class),
		@Type(name = DefinitionDescriptionIds.PLACES_FEATURE, value = PlacesFeatureDescription.class),
		@Type(name = DefinitionDescriptionIds.PROPERTIES, value = PropertiesDescription.class),
		@Type(name = DefinitionDescriptionIds.CATEGORY, value = CategoryDescription.class),
})
public interface DefinitionDescription extends Description {
}
