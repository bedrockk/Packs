package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.*;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.molang.util.Util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.io.IOException;
import java.io.InputStream;

@DisplayName("Item Deserialize Test")
public class DeserializeTest {

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
                } else {
                    throw new AssertionFailedError("Key " + k + " not found in output");
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
