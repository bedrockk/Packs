package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class RoofedCanopy {
	private int canopyHeight;
	private int coreWidth;
	private int outerRadius;
	private int innerRadius;
	private BlockReference leafBlock;
}