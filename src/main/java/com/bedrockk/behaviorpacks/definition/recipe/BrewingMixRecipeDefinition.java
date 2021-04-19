package com.bedrockk.behaviorpacks.definition.recipe;

import lombok.Data;

@Data
public class BrewingMixRecipeDefinition extends RecipeDefinition {
    private String input;
    private String reagent;
    private String output;
}
