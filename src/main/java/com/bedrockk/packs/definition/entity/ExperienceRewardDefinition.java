package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.ExpressionNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ExperienceRewardDefinition implements EntityComponentDefinition {
	private ExpressionNode onBred;
	private ExpressionNode onDeath;
}