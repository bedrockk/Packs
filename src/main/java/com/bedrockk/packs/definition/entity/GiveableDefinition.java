package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class GiveableDefinition implements EntityComponentDefinition {
	private List<Trigger> triggers;

	@Data
	public static class Trigger implements PackNode {
		private int cooldown;
		private List<ItemSelector> items;
		private EntityEventTriggerDefinition onGive;
	}
}