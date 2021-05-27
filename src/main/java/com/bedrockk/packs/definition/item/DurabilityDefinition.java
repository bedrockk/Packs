package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class DurabilityDefinition implements ItemComponentDefinition {
	private int maxDurability;
	private Range damageChance;
}
