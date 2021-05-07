package com.bedrockk.behaviorpacks.definition.recipe;

import com.bedrockk.behaviorpacks.type.JsonList;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ShapelessRecipeDefinition extends RecipeDefinition {
    private String group;
    private List<String> pattern;
    private int priority = 0;
    private JsonList<ItemEntry> ingredients;
    private JsonList<ItemEntry> result;
}
