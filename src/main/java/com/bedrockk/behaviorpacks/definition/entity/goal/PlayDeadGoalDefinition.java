package com.bedrockk.behaviorpacks.definition.entity.goal;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityComponentDefinition;
import com.bedrockk.behaviorpacks.type.DamageSourceType;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.220")
public class PlayDeadGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private double duration;
	private double forceBelowDeath;
	private double randomStartChance;
	private Range randomDamageRange;
	private List<DamageSourceType> damageSources;
	private boolean applyRegeneration;
}
