package com.bedrockk.packs.definition.feature.tree;

import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ChanceInformation;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Decoration {
	private ChanceInformation decorationChance;
	private BlockReference decorationBlock;
	private int numSteps;
	private StepDirection stepDirection;
}