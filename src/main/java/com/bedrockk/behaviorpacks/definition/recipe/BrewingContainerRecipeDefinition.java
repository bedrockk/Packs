package com.bedrockk.behaviorpacks.definition.recipe;

import lombok.Data;

@Data
public class BrewingContainerRecipeDefinition extends RecipeDefinition {
    private String input;
    private String reagent;
    private String output;
}
