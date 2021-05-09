package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class DurabilityDefinition implements ItemComponentDefinition {
	private int maxDurability;
	private Range damageChance;
}
