package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.event.BlockEventResponseBundleDefinition;
import com.bedrockk.packs.description.definition.BlockDefinitionDescription;
import com.bedrockk.packs.node.BlockComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@Jacksonized
public class BlockDefinition extends VersionedDefinition {
	private BlockDefinitionDescription description;
	@Singular
	private List<Permutation> permutations;
	@Singular
	private Map<String, BlockComponentNode> components;
	@Singular
	private Map<String, BlockEventResponseBundleDefinition> events;

	@Data
	@Builder
	@Jacksonized
	@JsonSince("1.16.100")
	public static class Permutation implements PackNode {
		private ExpressionNode condition;
		@Singular
		private Map<String, BlockComponentNode> components;
	}
}
