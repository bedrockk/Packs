package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class RoofedCanopy {
	private int canopyHeight;
	private int coreWidth;
	private int outerRadius;
	private int innerRadius;
	private BlockReference leafBlock;
}