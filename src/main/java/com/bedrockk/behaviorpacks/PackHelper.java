package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.*;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.behaviorpacks.json.PackAnnotationIntrospector;
import com.bedrockk.behaviorpacks.json.PackModule;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.experimental.UtilityClass;

import java.io.IOException;

@UtilityClass
public class PackHelper {
	public static final SemVersion FORMAT_VERSION = SemVersion.of("1.16.220");
	public static final JsonMapper MAPPER = JsonMapper.builder()
			.enable(JsonParser.Feature.ALLOW_COMMENTS)
			.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
			.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
			.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
			.serializationInclusion(JsonInclude.Include.NON_EMPTY)
			.propertyNamingStrategy(new PropertyNamingStrategies.SnakeCaseStrategy())
			.annotationIntrospector(new PackAnnotationIntrospector())
			.addModule(new PackModule())
			.build();
	public static SemVersion CURRENT_DEFINITION_VERSION;

	public static synchronized <T extends Definition> T deserialize(String json, Class<T> type) throws IOException {
		CURRENT_DEFINITION_VERSION = null;
		return MAPPER.readValue(json, type);
	}

	public static EntityDefinition deserializeEntity(String json) throws IOException {
		return deserialize(json, EntityDefinition.class);
	}

	public static BlockDefinition deserializeBlock(String json) throws IOException {
		return deserialize(json, BlockDefinition.class);
	}

	public static ItemDefinition deserializeItem(String json) throws IOException {
		return deserialize(json, ItemDefinition.class);
	}

	public static AnimationDefinition deserializeAnimation(String json) throws IOException {
		return deserialize(json, AnimationDefinition.class);
	}

	public static AnimationControllerDefinition deserializeAnimationController(String json) throws IOException {
		return deserialize(json, AnimationControllerDefinition.class);
	}

	public static ClientAnimationControllerDefinition deserializeClientAnimationController(String json) throws IOException {
		return deserialize(json, ClientAnimationControllerDefinition.class);
	}

	public static ClientAnimationDefinition deserializeClientAnimation(String json) throws IOException {
		return deserialize(json, ClientAnimationDefinition.class);
	}

	public static SpawnGroupDefinition deserializeSpawnGroup(String json) throws IOException {
		return deserialize(json, SpawnGroupDefinition.class);
	}

	public static SpawnRuleDefinition deserializeSpawnRule(String json) throws IOException {
		return deserialize(json, SpawnRuleDefinition.class);
	}

	public static FogSettingsDefinition deserializeFogSettings(String json) throws IOException {
		return deserialize(json, FogSettingsDefinition.class);
	}

	public static AttachableDefinition deserializeAttachable(String json) throws IOException {
		return deserialize(json, AttachableDefinition.class);
	}

	public static BiomeDefinition deserializeBiome(String json) throws IOException {
		return deserialize(json, BiomeDefinition.class);
	}

	public static RecipeDefinition deserializeRecipe(String json) throws IOException {
		return deserialize(json, RecipeDefinition.class);
	}

	public static FeatureRuleDefinition deserializeFeatureRule(String json) throws IOException {
		return deserialize(json, FeatureRuleDefinition.class);
	}

	public static FeatureDefinition deserializeFeature(String json) throws IOException {
		return deserialize(json, FeatureDefinition.class);
	}

	public static LootTableDefinition deserializeLootTable(String json) throws IOException {
		return deserialize(json, LootTableDefinition.class);
	}

	public static TradeTableDefinition deserializeTradeTable(String json) throws IOException {
		return deserialize(json, TradeTableDefinition.class);
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
