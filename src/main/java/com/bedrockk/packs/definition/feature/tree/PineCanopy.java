package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class PineCanopy {
	private int canopyHeight;
	private int baseRadius;
	private BlockReference leafBlock;
}