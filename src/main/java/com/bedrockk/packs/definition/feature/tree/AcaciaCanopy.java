package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Data;

@Data
public class AcaciaCanopy {
	private int canopySize;
	private Boolean simplifyCanopy;
	private BlockReference leafBlock;
}