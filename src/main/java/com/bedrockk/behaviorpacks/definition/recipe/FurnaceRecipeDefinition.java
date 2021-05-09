package com.bedrockk.behaviorpacks.definition.recipe;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FurnaceRecipeDefinition extends RecipeDefinition {
	private String group;
	private String input;
	private String output;
}
