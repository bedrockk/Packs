package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class StalkAndPounceOnTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double interestTime = 2.0;
	@Builder.Default
	private double leapDist = 0.8;
	@Builder.Default
	private double leapHeight = 0.9;
	@Builder.Default
	private double maxStalkDist = 10.0;
	@Builder.Default
	private double pounceMaxDist = 5.0;
	private boolean setPersistent;
	@Builder.Default
	private double stalkSpeed = 1.2;
	@Builder.Default
	private double strikeDist = 2.0;
	@Builder.Default
	private double stuckTime = 2.0;
	private EntityFilterDefinition stuckBlocks;
}