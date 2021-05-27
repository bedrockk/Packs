package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Trunk {
	private Range trunkHeight;
	private Integer heightModifier;
	private SubmergeAbility canBeSubmerged;
	private BlockReference trunkBlock;
	private Decoration trunkDecoration;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class SubmergeAbility implements PackNode {
		private boolean value;
		private Integer maxDepth;

		@JsonCreator
		public static SubmergeAbility of(boolean value) {
			return new SubmergeAbility(value, null);
		}
	}
}