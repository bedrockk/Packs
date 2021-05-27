package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class EquippableDefinition implements EntityComponentDefinition {
	@Singular
	private List<Slot> slots;

	@Data
	@Builder
	@Jacksonized
	public static class Slot implements PackNode {
		@Singular
		private List<ItemSelector> acceptedItems;
		private String interactText;
		private String item;
		private EntityEventTriggerDefinition onEquip;
		private EntityEventTriggerDefinition onUnequip;
		private int slot;
	}
}