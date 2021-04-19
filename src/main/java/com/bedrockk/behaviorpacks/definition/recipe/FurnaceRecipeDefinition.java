package com.bedrockk.behaviorpacks.definition.recipe;

import lombok.Data;

@Data
public class FurnaceRecipeDefinition extends RecipeDefinition {
    private String group;
    private String input;
    private String output;
}
