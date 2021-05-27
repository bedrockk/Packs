package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AcaciaCanopy {
	private int canopySize;
	private Boolean simplifyCanopy;
	private BlockReference leafBlock;
}