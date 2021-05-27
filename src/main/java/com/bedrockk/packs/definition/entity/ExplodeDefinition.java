package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ExplodeDefinition implements EntityComponentDefinition {
	private Range fuseLength;
	@Builder.Default
	private boolean breaksBlocks = true;
	private boolean causesFire;
	private boolean destroyAffectedByGriefing;
	private boolean fireAffectedByGriefing;
	private boolean fuseLit;
	private boolean allowDamageUnderwater;
	@Builder.Default
	private double maxResistance = 3.40282e+38;
	@Builder.Default
	private double power = 3.0;
}