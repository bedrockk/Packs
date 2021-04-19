package com.bedrockk.behaviorpacks;

import com.bedrockk.behaviorpacks.definition.AnimationControllersDefinition;
import com.bedrockk.behaviorpacks.definition.FilterDefinition;
import com.bedrockk.behaviorpacks.definition.ItemDefinition;
import com.bedrockk.behaviorpacks.definition.recipe.RecipeDefinition;
import com.bedrockk.behaviorpacks.definition.recipe.ShapedRecipeDefinition;
import com.bedrockk.molang.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

@DisplayName("Item Deserialize Test")
public class DeserializeTest {

    @Test
    public void testRecipe() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("acacia_boat.json");
        Assertions.assertNotNull(file);

        RecipeDefinition root = BehaviorPackFactory.deserializeRecipe(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    public void testItem() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_item.json");
        Assertions.assertNotNull(file);

        ItemDefinition root = BehaviorPackFactory.deserializeItem(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    public void testController() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("controller_test.json");
        Assertions.assertNotNull(file);

        AnimationControllersDefinition root = BehaviorPackFactory.deserializeAnimationControllers(Util.readFile(file));
        System.out.println(BehaviorPackFactory.serialize(root));
    }

    @Test
    public void testFilter() throws IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("test_filter.json");
        Assertions.assertNotNull(file);

        FilterDefinition definition = BehaviorPackFactory.MAPPER.readValue(Util.readFile(file), FilterDefinition.class);
        System.out.println(BehaviorPackFactory.serialize(definition));
    }
}
