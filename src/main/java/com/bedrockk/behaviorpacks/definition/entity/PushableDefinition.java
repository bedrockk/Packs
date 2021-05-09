package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class PushableDefinition implements EntityComponentDefinition {
	private Boolean isPushable = true;
	private Boolean isPushableByPiston = true;
}