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
public class GiveableDefinition implements EntityComponentDefinition {
	@Singular
	private List<Trigger> triggers;

	@Data
	@Builder
	@Jacksonized
	public static class Trigger implements PackNode {
		private int cooldown;
		@Singular
		private List<ItemSelector> items;
		private EntityEventTriggerDefinition onGive;
	}
}