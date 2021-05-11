package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.block.BlockEventResponseDefinition;
import com.bedrockk.packs.description.definition.BlockDefinitionDescription;
import com.bedrockk.packs.node.BlockComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BlockDefinition extends VersionedDefinition {
	private BlockDefinitionDescription description;
	private List<Permutation> permutations;
	private Map<String, BlockComponentNode> components;
	private Map<String, BlockEventResponseDefinition> events;

	@Data
	@JsonSince("1.16.100")
	public static class Permutation implements PackNode {
		private ExpressionNode condition;
		private Map<String, BlockComponentNode> components;
	}
}
