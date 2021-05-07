package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

@Data
public class NavigationHoverDefinition implements EntityComponentDefinition{
	private boolean avoidDamageBlocks = false;
	private boolean avoidPortals = false;
	private boolean avoidSun = false;
	private boolean avoidWater = false;
	private boolean canBreach = false;
	private boolean canBreakDoors = false;
	private boolean canJump = true;
	private boolean canOpenDoors = false;
	private boolean canOpenIronDoors = false;
	private boolean canPassDoors = true;
	private boolean canPathFromAir = false;
	private boolean canPathOverLava = false;
	private boolean canPathOverWater = false;
	private boolean canSink = true;
	private boolean canSwim = false;
	private boolean canWalk = true;
	private boolean canWalkInLava = false;
	private Boolean isAmphibious = false;
}