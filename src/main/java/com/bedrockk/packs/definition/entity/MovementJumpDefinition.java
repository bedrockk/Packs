package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Pair;
import lombok.Data;

import java.util.List;

@Data
public class MovementJumpDefinition implements EntityComponentDefinition {
	private double value;
	private double maxTurn = 30.0;
	private List<Pair<Double, Double>> jumpDelay;
}