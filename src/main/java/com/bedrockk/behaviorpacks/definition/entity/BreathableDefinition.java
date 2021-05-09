package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class BreathableDefinition implements EntityComponentDefinition {
	private List<String> breatheBlocks;
	private boolean breathesAir = true;
	private boolean breathesLava = true;
	private boolean breathesSolids = false;
	private boolean breathesWater = false;
	private boolean generatesBubbles = true;
	private double inhaleTime = 0.0;
	private int suffocateTime;
	private int totalSupply = 15;
	private List<String> nonBreatheBlocks;
}