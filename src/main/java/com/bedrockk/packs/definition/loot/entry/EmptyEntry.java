package com.bedrockk.packs.definition.loot.entry;

import com.bedrockk.packs.definition.loot.LootPoolEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class EmptyEntry extends LootPoolEntry {
	private int weight;
}
