package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.*;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

public class PackHelper {
    public static final SemVersion FORMAT_VERSION = SemVersion.of("1.16.220");
    public static final JsonMapper MAPPER = JsonMapper.builder()
            .enable(JsonParser.Feature.ALLOW_COMMENTS)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .serializationInclusion(JsonInclude.Include.NON_EMPTY)
            .propertyNamingStrategy(new PropertyNamingStrategies.SnakeCaseStrategy())
            .addModule(new Jdk8Module())
            .build();

    public static EntityDefinition deserializeEntity(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, EntityDefinition.class);
    }

    public static BlockDefinition deserializeBlock(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, BlockDefinition.class);
    }

    public static ItemDefinition deserializeItem(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, ItemDefinition.class);
    }

    public static AnimationDefinition deserializeAnimation(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, AnimationDefinition.class);
    }

    public static AnimationControllerDefinition deserializeAnimationController(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, AnimationControllerDefinition.class);
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

    public static LootTableDefinition deserializeLootTable(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, LootTableDefinition.class);
    }

    public static TradeTableDefinition deserializeTradeTable(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, TradeTableDefinition.class);
    }

    public static String serialize(Object object) throws JsonProcessingException {
        return MAPPER.writeValueAsString(object);
    }

    public static String serializeAsPretty(Object object) throws JsonProcessingException {
        return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

    public static JsonNode toJsonNode(Object object) {
        return MAPPER.convertValue(object, JsonNode.class);
    }
}
