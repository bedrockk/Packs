package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class SlimeAttackGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@JsonProperty("set_persistent")
	private boolean persistent;
}