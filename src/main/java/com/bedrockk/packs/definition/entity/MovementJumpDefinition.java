package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Pair;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class MovementJumpDefinition implements EntityComponentDefinition {
	private double value;
	@Builder.Default
	private double maxTurn = 30.0;
	@Singular("jump")
	private List<Pair<Double, Double>> jumpDelay;
}