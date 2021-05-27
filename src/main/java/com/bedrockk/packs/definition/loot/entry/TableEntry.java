package com.bedrockk.packs.definition.loot.entry;

import com.bedrockk.packs.definition.loot.LootPoolEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class TableEntry extends LootPoolEntry {
	private Path name;
	private int weight;
}
