package com.bedrockk.packs;

import com.bedrockk.molang.util.Util;
import com.bedrockk.packs.definition.*;
import com.bedrockk.packs.definition.recipe.RecipeDefinition;
import com.bedrockk.packs.type.JsonList;
import com.bedrockk.packs.type.TimeMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.beans.BeanDescriptor;
import java.io.IOException;
import java.io.InputStream;

@DisplayName("Deserialize Tests")
public class DeserializeTest {

	@Test
	@DisplayName("Hmmm Test")
	public void testHmmm() {
		var list = JsonList.<String>builder(new JsonList<>()).add("tttrerte").build();
		var timeMap = TimeMap.<String>builder(new TimeMap<>()).put(0.1, "sdad").build();
	}

	@Test
	@DisplayName("Entity Test")
	public void testEntity() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_entity.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		EntityDefinition root = PackHelper.deserializeEntity(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Recipe Test")
	public void testRecipe() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_recipe.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		RecipeDefinition root = PackHelper.deserializeRecipe(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Item Test")
	public void testItem() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_item.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		ItemDefinition root = PackHelper.deserializeItem(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Block Test")
	public void testBlock() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_block.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		var root = PackHelper.deserializeBlock(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Feature Rule Test")
	public void testFeatureRule() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_feature_rule.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		FeatureRuleDefinition root = PackHelper.deserializeFeatureRule(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Feature Test")
	public void testFeature() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_feature.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		FeatureDefinition root = PackHelper.deserializeFeature(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Loot Table Test")
	public void testLootTable() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_loot_table.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		LootTableDefinition root = PackHelper.deserializeLootTable(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Animation Controller Test")
	public void testAnimationController() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_animation_controller.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		AnimationControllerDefinition root = PackHelper.deserializeAnimationController(input);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Filter Test")
	public void testFilter() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_filter.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		EntityFilterDefinition root = PackHelper.MAPPER.readValue(input, EntityFilterDefinition.class);
		assertResult(input, root);
	}

	@Test
	@DisplayName("Render Controller Test")
	public void testRenderController() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("test_render_controller.json");
		Assertions.assertNotNull(file);

		String input = Util.readFile(file);
		RenderControllerDefinition root = PackHelper.deserializeRenderController(input);
		assertResult(input, root);
	}

	private static void assertResult(String input, Definition definition) throws JsonProcessingException {
		JsonNode expected = PackHelper.MAPPER.readTree(input);
		assertTree(expected, PackHelper.toJsonNode(definition));
	}

	private static void assertTree(JsonNode expected, JsonNode actual) {
		if (expected.isObject() && actual.isObject()) {
			expected.fields().forEachRemaining(e -> {
				String k = e.getKey();
				JsonNode v = e.getValue();
				if (actual.has(k)) {
					assertTree(v, actual.get(k));
				} else if (!v.isEmpty()) {
					throw new AssertionFailedError("Key \"" + k + "\" not found in output at: \n" + actual.toPrettyString());
				}
			});
		} else if (expected.isArray() && actual.isArray()) {
			for (int i = 0; i < expected.size(); i++) {
				assertTree(expected.get(i), actual.get(i));
			}
		}

		Assertions.assertEquals(expected.getNodeType(), actual.getNodeType());
	}
}
