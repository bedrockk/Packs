package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class EquippableDefinition implements EntityComponentDefinition {
	private List<Slot> slots;

	@Data
	public static class Slot implements PackNode {
		private List<ItemSelector> acceptedItems;
		private String interactText;
		private String item;
		private EntityEventTriggerDefinition onEquip;
		private EntityEventTriggerDefinition onUnequip;
		private int slot;
	}
}