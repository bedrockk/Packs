package com.bedrockk.packs.definition.recipe;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FurnaceRecipeDefinition extends RecipeDefinition {
	private String group;
	private String input;
	private String output;
}
