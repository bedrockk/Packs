package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class PreferredPathDefinition implements EntityComponentDefinition {
	private double defaultBlockCost = 0.0;
	private int jumpCost = 0;
	private int maxFallBlocks = 3;
	private List<PathBlock> preferredPathBlocks;

	@Data
	public static class PathBlock implements PackNode {
		private double cost;
		private List<String> blocks;
	}
}