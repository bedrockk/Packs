package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class MegaCanopy {
	private int canopyHeight;
	private Integer coreWidth;
	private int baseRadius;
	private Boolean simplifyCanopy;
	private BlockReference leafBlock;
}