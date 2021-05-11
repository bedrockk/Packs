package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.Pair;
import lombok.Data;

import java.util.List;

@Data
public class RandomSpreadCanopy {
	private int canopyHeight;
	private int canopyRadius;
	private int leafPlacementAttempts;
	private List<Pair<BlockReference, Double>> leafBlocks;
}