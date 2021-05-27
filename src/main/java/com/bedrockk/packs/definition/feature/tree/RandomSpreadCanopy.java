package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Pair;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RandomSpreadCanopy {
	private int canopyHeight;
	private int canopyRadius;
	private int leafPlacementAttempts;
	@Singular
	private List<Pair<BlockReference, Double>> leafBlocks;
}