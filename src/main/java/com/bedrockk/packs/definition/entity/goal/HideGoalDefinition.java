package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.POIType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class HideGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double speedMultiplier;
	private POIType poiType;
	private int duration;
}