package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class SpruceCanopy {
	private int lowerOffset;
	private int upperOffset;
	private int maxRadius;
	private BlockReference leafBlock;
}