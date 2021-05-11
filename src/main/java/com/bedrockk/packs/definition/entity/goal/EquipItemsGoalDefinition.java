package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Data;

@Data
@JsonSince("1.16.0")
public class EquipItemsGoalDefinition implements EntityComponentDefinition {
	private int priority;
}