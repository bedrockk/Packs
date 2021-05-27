package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class PreferredPathDefinition implements EntityComponentDefinition {
	private double defaultBlockCost;
	private int jumpCost;
	@Builder.Default
	private int maxFallBlocks = 3;
	@Singular
	private List<PathBlock> preferredPathBlocks;

	@Data
	@Builder
	@Jacksonized
	public static class PathBlock implements PackNode {
		private double cost;
		@Singular
		private List<String> blocks;
	}
}