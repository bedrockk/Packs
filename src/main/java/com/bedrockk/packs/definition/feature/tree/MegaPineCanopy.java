package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class MegaPineCanopy {
	private int canopyHeight;
	private Integer coreWidth;
	private int baseRadius;
	private double radiusStepModifier;
	private BlockReference leafBlock;
}