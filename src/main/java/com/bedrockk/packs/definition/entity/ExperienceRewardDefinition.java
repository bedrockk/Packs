package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;

@Data
public class ExperienceRewardDefinition implements EntityComponentDefinition {
	private ExpressionNode onBred;
	private ExpressionNode onDeath;
}