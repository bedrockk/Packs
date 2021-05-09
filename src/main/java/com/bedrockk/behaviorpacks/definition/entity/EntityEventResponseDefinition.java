package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.Definition;
import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.DamageSourceType;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class EntityEventResponseDefinition implements Definition {
	private String trigger;
	private RunCommand runCommand;
	private RunCommand execute; // legacy
	private Damage damage;
	private DecrementStack decrementStack;
	private Die die;
	private AddMobEffect addMobEffect;
	private RemoveMobEffect removeMobEffect;
	private PlayEffect playEffect;
	private PlaySound playSound;
	private Teleport teleport;
	private TransformItem transformItem;

	private List<SequenceEntry> sequence;
	private List<RandomizeEntry> randomize;
	private Add add;
	private Remove remove;

	@Data
	public static class RunCommand implements PackNode {
		private List<String> command;
	}

	@Data
	public static class Damage implements PackNode {
		private DamageSourceType type;
		private double amount;
		private Target target;
	}

	@Data
	public static class DecrementStack implements PackNode {
		private boolean ignoreGameMode;
	}

	public static class Die implements PackNode {
		// NOOP
	}

	@Data
	public static class AddMobEffect implements PackNode {
		private EffectType effect;
		private Target target;
		private int duration;
		private int amplifier;
	}

	@Data
	public static class RemoveMobEffect implements PackNode {
		private EffectType effect;
		private Target target;
	}

	@Data
	public static class PlayEffect implements PackNode {
		private int data;
		private Target target;
		private String effect;
	}

	@Data
	public static class PlaySound implements PackNode {
		private Target target;
		private String sound;
	}

	@Data
	public static class Teleport implements PackNode {
		private Target target;
		private boolean avoidWater;
		private boolean landOnBlock;
		private ImmutableVec3 destination;
		private ImmutableVec3 maxRange;
	}

	@Data
	public static class TransformItem implements PackNode {
		private String transform;
	}

	@Data
	public static class SequenceEntry implements PackNode {
		private EntityFilterDefinition filters;
		private EntityEventResponseDefinition event;

		@JsonCreator
		public static SequenceEntry fromJson(ObjectNode node) {
			SequenceEntry entry = new SequenceEntry();
			entry.filters = PackHelper.MAPPER.convertValue(node.remove("filters"), EntityFilterDefinition.class);
			entry.event = PackHelper.MAPPER.convertValue(node, EntityEventResponseDefinition.class);
			return entry;
		}

		@JsonValue
		public ObjectNode toJson() {
			ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
			node.set("filters", PackHelper.toJsonNode(this.filters));
			return node;
		}
	}

	@Data
	public static class RandomizeEntry implements PackNode {
		private int weight;
		private EntityEventResponseDefinition event;

		@JsonCreator
		public static RandomizeEntry fromJson(ObjectNode node) {
			RandomizeEntry entry = new RandomizeEntry();
			entry.weight = node.remove("weight").asInt();
			entry.event = PackHelper.MAPPER.convertValue(node, EntityEventResponseDefinition.class);
			return entry;
		}

		@JsonValue
		public ObjectNode toJson() {
			ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
			node.set("weight", PackHelper.toJsonNode(this.weight));
			return node;
		}
	}

	@Data
	public static class Add implements PackNode {
		private List<String> componentGroups;
		private AddMobEffect spellEffects;
		private List<EntityComponentNode> group;
	}

	@Data
	public static class Remove implements PackNode {
		private List<String> componentGroups;
		private RemoveMobEffect spellEffects;
	}

	public enum Target {
		SELF,
		OTHER,
		HOLDER;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
