package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class FancyCanopy {
	private int height;
	private int radius;
	private BlockReference leafBlock;
}