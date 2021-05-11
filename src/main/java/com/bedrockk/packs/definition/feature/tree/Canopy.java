package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ChanceInformation;
import com.bedrockk.packs.type.JsonList;
import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class Canopy {
	private Range canopyOffset;
	private Integer minWidth;
	private Slope canopySlope;
	private JsonList<ChanceInformation> variationChance;
	private BlockReference leafBlock;
	private Decoration canopyDecoration;

	@Data
	public static class Slope implements PackNode {
		private int rise;
		private int run;
	}
}