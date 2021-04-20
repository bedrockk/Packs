package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.*;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.behaviorpacks.definition.recipe.ShapedRecipeDefinition;
import com.bedrockk.molang.util.Util;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

@DisplayName("Item Deserialize Test")
public class DeserializeTest {

    @Test
    @DisplayName("Recipe Test")
    public void testRecipe() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_recipe.json");
        Assertions.assertNotNull(file);

        RecipeDefinition root = BehaviorPackFactory.deserializeRecipe(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    @DisplayName("Item Test")
    public void testItem() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_item.json");
        Assertions.assertNotNull(file);

        ItemDefinition root = BehaviorPackFactory.deserializeItem(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    @DisplayName("Feature Rule Test")
    public void testFeatureRule() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_feature_rule.json");
        Assertions.assertNotNull(file);

        FeatureRuleDefinition root = BehaviorPackFactory.deserializeFeatureRule(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    @DisplayName("Feature Test")
    public void testFeature() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_feature.json");
        Assertions.assertNotNull(file);

        FeatureDefinition root = BehaviorPackFactory.deserializeFeature(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    @DisplayName("Animation Controller Test")
    public void testController() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_controller.json");
        Assertions.assertNotNull(file);

        AnimationControllersDefinition root = BehaviorPackFactory.deserializeAnimationControllers(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    @DisplayName("Filter Test")
    public void testFilter() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_filter.json");
        Assertions.assertNotNull(file);

        FilterDefinition definition = BehaviorPackFactory.MAPPER.readValue(Util.readFile(file), FilterDefinition.class);
        System.out.println(BehaviorPackFactory.serialize(definition));
    }
}
