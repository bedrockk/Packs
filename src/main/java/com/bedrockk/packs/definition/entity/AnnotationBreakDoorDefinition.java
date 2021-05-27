package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.GameDifficultyType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AnnotationBreakDoorDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double breakTime = 12.0;
	@Builder.Default
	private GameDifficultyType minDifficulty = GameDifficultyType.HARD;
}