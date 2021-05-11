package com.bedrockk.packs.definition.recipe;

import com.bedrockk.packs.definition.VersionedDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Getter
public abstract class RecipeDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	private List<String> tags;

	@Data
	public static class ItemEntry implements PackNode {
		private String item;
		private int data = 0;
		private int count = 1;
	}
}
