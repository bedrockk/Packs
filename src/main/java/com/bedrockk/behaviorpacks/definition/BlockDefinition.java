package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.block.BlockEventResponseDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.description.definition.BlockDefinitionDescription;
import com.bedrockk.behaviorpacks.node.BlockComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
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
