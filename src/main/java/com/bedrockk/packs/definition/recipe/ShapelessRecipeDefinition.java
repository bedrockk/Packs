package com.bedrockk.packs.definition.recipe;

import com.bedrockk.packs.type.JsonList;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class ShapelessRecipeDefinition extends RecipeDefinition {
	private String group;
	@Singular("patternLine")
	private List<String> pattern;
	@Builder.Default
	private int priority = 0;
	private JsonList<ItemEntry> ingredients;
	private JsonList<ItemEntry> result;
}
