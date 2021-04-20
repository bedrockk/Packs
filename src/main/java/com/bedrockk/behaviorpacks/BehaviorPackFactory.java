package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.*;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.util.Locale;

public class BehaviorPackFactory {
    public static final SemVersion FORMAT_VERSION = SemVersion.of("1.16.200");
    public static final ObjectMapper MAPPER = new JsonMapper()
            .enable(JsonParser.Feature.ALLOW_COMMENTS)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setPropertyNamingStrategy(new PropertyNamingStrategies.SnakeCaseStrategy());

    public static EntityDefinition deserializeEntity(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, EntityDefinition.class);
    }

    public static BlockDefinition deserializeBlock(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, BlockDefinition.class);
    }

    public static ItemDefinition deserializeItem(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, ItemDefinition.class);
    }

    public static AnimationControllersDefinition deserializeAnimationControllers(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, AnimationControllersDefinition.class);
    }

    public static RecipeDefinition deserializeRecipe(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, RecipeDefinition.class);
    }

    public static FeatureRuleDefinition deserializeFeatureRule(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, FeatureRuleDefinition.class);
    }

    public static FeatureDefinition deserializeFeature(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, FeatureDefinition.class);
    }

    public static String serialize(Object object) throws JsonProcessingException {
        return MAPPER.writeValueAsString(object);
    }

    public static JsonNode toJsonNode(Object object) {
        return MAPPER.convertValue(object, JsonNode.class);
    }
}
