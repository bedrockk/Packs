package com.bedrockk.behaviorpacks.definition.feature.tree;

import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

@Data
public class PineCanopy {
	private int canopyHeight;
	private int baseRadius;
	private BlockReference leafBlock;
}