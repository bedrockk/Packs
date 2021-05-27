package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.EffectType;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class HealableDefinition implements EntityComponentDefinition {
	private EntityFilterDefinition filters;
	private boolean forceUse;
	@Singular
	private List<HealItem> items;

	@Data
	@Builder
	@Jacksonized
	public static class HealItem implements PackNode {
		private ItemSelector item;
		private int healAmount;
		private EntityFilterDefinition filters;
		@Singular
		private List<Effect> effects;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Effect implements PackNode {
		private EffectType name;
		private double chance;
		private int duration;
		private int amplifier;
	}
}