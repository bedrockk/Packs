package com.bedrockk.packs.definition.recipe;

import com.bedrockk.packs.type.JsonList;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class ShapedRecipeDefinition extends RecipeDefinition {
	private String group;
	@Singular("patternLine")
	private List<String> pattern;
	@Builder.Default
	private int priority = 0;
	@Singular("putKey")
	private Map<String, ItemEntry> key;
	private JsonList<ItemEntry> result;
}
