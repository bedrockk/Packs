package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Range;
import lombok.Data;

@Data
public class ExplodeDefinition implements EntityComponentDefinition {
	private Range fuseLength;
	private boolean breaksBlocks = true;
	private boolean causesFire = false;
	private boolean destroyAffectedByGriefing = false;
	private boolean fireAffectedByGriefing = false;
	private boolean fuseLit = false;
	private boolean allowDamageUnderwater;
	private double maxResistance = 3.40282e+38;
	private double power = 3.0;
}