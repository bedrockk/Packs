package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class NavigationFlyDefinition implements EntityComponentDefinition {
	private boolean avoidDamageBlocks;
	private boolean avoidPortals;
	private boolean avoidSun;
	private boolean avoidWater;
	private boolean canBreach;
	private boolean canBreakDoors;
	@Builder.Default
	private boolean canJump = true;
	private boolean canOpenDoors;
	private boolean canOpenIronDoors;
	@Builder.Default
	private boolean canPassDoors = true;
	private boolean canPathFromAir;
	private boolean canPathOverLava;
	private boolean canPathOverWater;
	@Builder.Default
	private boolean canSink = true;
	private boolean canSwim;
	@Builder.Default
	private boolean canWalk = true;
	private boolean canWalkInLava;
	private Boolean isAmphibious;
}