package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
public class FallenTrunk {
	private Range logLength;
	private Integer stumpHeight;
	private Integer heightModifier;
	private BlockReference trunkBlock;
	private String logDecorationFeature;
	private Decoration trunkDecoration;
}