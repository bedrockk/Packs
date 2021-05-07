package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.POIType;
import lombok.Data;

@Data
public class MoveToPoiGoalDefinition implements EntityComponentDefinition{
	private int priority;
	private double speedMultiplier;
	private POIType poiType;
}