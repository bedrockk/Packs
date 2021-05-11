package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SlimeAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@JsonProperty("set_persistent")
	private boolean persistent;
}