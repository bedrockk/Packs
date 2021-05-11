package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class Trunk {
	private Range trunkHeight;
	private Integer heightModifier;
	private SubmergeAbility canBeSubmerged;
	private BlockReference trunkBlock;
	private Decoration trunkDecoration;

	@Data
	public static class SubmergeAbility implements PackNode {
		private int maxDepth;

		@JsonCreator
		public static SubmergeAbility fromJson(boolean value) {
			var ab = new SubmergeAbility();
			ab.maxDepth = value ? 1 : 0;
			return ab;
		}
	}
}