package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
public class CelebrateHuntDefinition implements EntityComponentDefinition{
	private boolean broadcast = true;
	private EntityFilterDefinition celeberationTargets;
	private String celebrateSound;
	private int duration = 4;
	private double radius = 16.0;
	private Range soundInterval;
}