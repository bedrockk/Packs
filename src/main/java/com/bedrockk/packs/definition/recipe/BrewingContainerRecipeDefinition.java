package com.bedrockk.packs.definition.recipe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class BrewingContainerRecipeDefinition extends RecipeDefinition {
	private String input;
	private String reagent;
	private String output;
}
