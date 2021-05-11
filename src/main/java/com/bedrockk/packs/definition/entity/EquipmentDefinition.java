package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.SlotType;
import lombok.Data;

import java.nio.file.Path;
import java.util.List;

@Data
public class EquipmentDefinition implements EntityComponentDefinition {
	private List<Entry> slotDropChance;
	private Path table;

	@Data
	public static class Entry {
		private SlotType slot;
		private double dropChance;
	}
}
