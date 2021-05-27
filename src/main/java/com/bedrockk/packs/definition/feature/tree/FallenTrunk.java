package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized

public class FallenTrunk {
	private Range logLength;
	private Integer stumpHeight;
	private Integer heightModifier;
	private BlockReference trunkBlock;
	private String logDecorationFeature;
	private Decoration trunkDecoration;
}