package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class BossDefinition implements EntityComponentDefinition {

	private int hudRange = 55;
	private String name;
	private boolean shouldDarkenSky = false;
}