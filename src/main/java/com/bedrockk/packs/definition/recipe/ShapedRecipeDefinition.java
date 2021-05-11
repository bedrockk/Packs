package com.bedrockk.packs.definition.recipe;

import com.bedrockk.packs.type.JsonList;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ShapedRecipeDefinition extends RecipeDefinition {
	private String group;
	private List<String> pattern;
	private int priority = 0;
	private Map<String, ItemEntry> key;
	private JsonList<ItemEntry> result;
}
