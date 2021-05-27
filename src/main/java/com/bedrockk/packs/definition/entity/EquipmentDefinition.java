package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.SlotType;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;
import java.util.List;

@Data
@Builder
@Jacksonized
public class EquipmentDefinition implements EntityComponentDefinition {
	@Singular("chance")
	private List<Entry> slotDropChance;
	private Path table;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Entry {
		private SlotType slot;
		private double dropChance;
	}
}
