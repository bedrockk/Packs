package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SpruceCanopy {
	private int lowerOffset;
	private int upperOffset;
	private int maxRadius;
	private BlockReference leafBlock;
}