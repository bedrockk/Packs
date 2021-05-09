package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.type.ExpressionNode;
import lombok.Data;

@Data
public class ExperienceRewardDefinition implements EntityComponentDefinition {
	private ExpressionNode onBred;
	private ExpressionNode onDeath;
}