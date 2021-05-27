package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.DamageSourceType;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.220")
public class PlayDeadGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double duration;
	private double forceBelowDeath;
	private double randomStartChance;
	private Range randomDamageRange;
	@Singular
	private List<DamageSourceType> damageSources;
	private boolean applyRegeneration;
}
