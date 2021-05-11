package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class SpruceCanopy {
	private int lowerOffset;
	private int upperOffset;
	private int maxRadius;
	private BlockReference leafBlock;
}