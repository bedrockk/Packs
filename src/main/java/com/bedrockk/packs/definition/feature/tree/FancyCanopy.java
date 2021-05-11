package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class FancyCanopy {
	private int height;
	private int radius;
	private BlockReference leafBlock;
}