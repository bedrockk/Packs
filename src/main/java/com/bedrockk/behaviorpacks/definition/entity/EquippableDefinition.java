package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ItemSelector;
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