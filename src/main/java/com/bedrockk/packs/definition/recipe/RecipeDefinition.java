package com.bedrockk.packs.definition.recipe;

import com.bedrockk.packs.definition.VersionedDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class RecipeDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	@Singular
	private List<String> tags;

	@Data
	@Builder
	@Jacksonized
	public static class ItemEntry implements PackNode {
		private String item;
		@Builder.Default
		private int data = 0;
		@Builder.Default
		private int count = 1;
	}
}
