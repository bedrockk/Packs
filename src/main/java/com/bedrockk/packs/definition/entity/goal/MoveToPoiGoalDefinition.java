package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.POIType;
import lombok.Data;

@Data
public class MoveToPoiGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private POIType poiType;
}