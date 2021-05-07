package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.description.entity.SpellEffectsDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class HealableDefinition implements EntityComponentDefinition{
	private EntityFilterDefinition filters;
	private boolean forceUse = false;
	private List<HealItem> items;

	@Data
	public static class HealItem implements PackNode {
		private ItemSelector item;
		private int healAmount;
		private EntityFilterDefinition filters;
		private List<Effect> effects;
	}

	@Data
	public static class Effect implements PackNode {
		private EffectType name;
		private double chance;
		private int duration;
		private int amplifier;
	}
}