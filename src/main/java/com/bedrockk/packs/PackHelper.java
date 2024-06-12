package com.bedrockk.packs;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.definition.*;
import com.bedrockk.packs.definition.recipe.RecipeDefinition;
import com.bedrockk.packs.json.PackAnnotationIntrospector;
import com.bedrockk.packs.json.PackModule;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.util.ClassUtil;
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

	public static synchronized <T> T deserialize(String json, Class<T> type) throws IOException {
		var node = MAPPER.readTree(json);
		if (node.isObject() && node.has("format_version") && node.get("format_version").isTextual()) {
			CURRENT_DEFINITION_VERSION = SemVersion.of(node.get("format_version").asText());
		} else {
			CURRENT_DEFINITION_VERSION = null;
		}
		MAPPER.setConfig(MAPPER.getDeserializationConfig().withAttribute("no-converter", false));
		T value = MAPPER.readValue(json, type);
		CURRENT_DEFINITION_VERSION = null;
		return value;
	}

	public static EntityDefinition deserializeEntity(String json) throws IOException {
		return deserialize(json, EntityDefinition.class);
	}

	public static ClientEntityDefinition deserializeClientEntity(String json) throws IOException {
		return deserialize(json, ClientEntityDefinition.class);
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

	public static TextureSetDefinition deserializeTextureSet(String json) throws IOException {
		return deserialize(json, TextureSetDefinition.class);
	}

	public static RenderControllerDefinition deserializeRenderController(String json) throws IOException {
		return deserialize(json, RenderControllerDefinition.class);
	}

	public static <T> String serialize(T object) throws JsonProcessingException {
		return serialize(object, null, false);
	}

	public static <T> String serializePretty(T object) throws JsonProcessingException {
		return serialize(object, null, true);
	}

	public static <T> String serialize(T object, SemVersion version, boolean pretty) throws JsonProcessingException {
		var converter = object.getClass().getAnnotation(JsonConverter.class);
		Object input = object;
		if (converter != null && converter.past() != VersionConverter.None.class) {
			var inst = ClassUtil.createInstance(converter.past(), true);
			if (inst != null) {
				var node = toJsonNode(object);
				if (version == null) {
					if (node.has("format_version") && node.get("format_version").isTextual()) {
						version = SemVersion.of(node.get("format_version").asText());
					} else {
						version = FORMAT_VERSION;
					}
				}
				input = inst.convert(toJsonNode(input), version);
			}
		}
		return pretty ? MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(object) : MAPPER.writeValueAsString(object);
	}

	public static <T> T convert(Object value, Class<T> type) {
		if (value == null) {
			return null;
		}
		return MAPPER.convertValue(value, type);
	}

	public static <T> T convert(Object value, TypeReference<T> type) {
		if (value == null) {
			return null;
		}
		return MAPPER.convertValue(value, type);
	}

	public static JsonNode toJsonNode(Object object) {
		return MAPPER.convertValue(object, JsonNode.class);
	}
}
