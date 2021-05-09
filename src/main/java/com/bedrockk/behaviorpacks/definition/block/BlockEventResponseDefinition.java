package com.bedrockk.behaviorpacks.definition.block;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.Definition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.DamageSourceType;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
public class BlockEventResponseDefinition implements Definition {
	private Map<String, ExpressionNode> setBlockProperty;
	private SetBlock setBlock;
	private SetBlockAtPos setBlockAtPos;
	private SpawnLoot spawnLoot;
	private Die die;
	private RunCommand runCommand;
	private Damage damage;
	private DecrementStack decrementStack;
	private AddMobEffect addMobEffect;
	private RemoveMobEffect removeMobEffect;
	private PlayEffect playEffect;
	private PlaySound playSound;
	private Teleport teleport;
	private TransformItem transformItem;
	private Trigger trigger;

	private List<BlockEventResponseDefinition> sequence;
	private List<RandomizeEntry> randomize;

	@Data
	public static class Trigger implements PackNode {
		private String event;
		private Target target;
		private ExpressionNode condition;
	}

	@Data
	public static class SetBlock implements PackNode {
		private String blockType;
	}

	@Data
	public static class SetBlockAtPos implements PackNode {
		private String blockType;
		private ImmutableVec3 blockOffset;
	}

	@Data
	public static class SpawnLoot implements PackNode {
		private Path table;
	}

	@Data
	public static class Die implements PackNode {
		private Target target;
	}

	@Data
	public static class RunCommand implements PackNode {
		private List<String> command;
		private Target target;
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
	public static class RandomizeEntry implements PackNode {
		private int weight;
		private BlockEventResponseDefinition event;

		@JsonCreator
		public void fromJson(ObjectNode node) {
			this.weight = node.remove("weight").asInt();
			this.event = PackHelper.MAPPER.convertValue(node, BlockEventResponseDefinition.class);
		}

		@JsonValue
		public ObjectNode toJson() {
			ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
			node.set("weight", PackHelper.toJsonNode(this.weight));
			return node;
		}
	}

	public enum Target {
		SELF,
		OTHER;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
