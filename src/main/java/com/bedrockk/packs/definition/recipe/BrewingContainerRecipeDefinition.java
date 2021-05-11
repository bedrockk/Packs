package com.bedrockk.packs.definition.recipe;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BrewingContainerRecipeDefinition extends RecipeDefinition {
	private String input;
	private String reagent;
	private String output;
}
