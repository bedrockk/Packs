package com.bedrockk.behaviorpacks.definition.block;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventDefinition;
import com.bedrockk.behaviorpacks.type.DamageType;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.bedrockk.behaviorpacks.type.MolangExpression;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BlockEventDefinition {
    private Map<String, MolangExpression> setBlockProperty;
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

    private List<BlockEventDefinition> sequence;
    private List<RandomizeEntry> randomize;

    @Data
    public static class Trigger {
        private String event;
        private Target target;
        private MolangExpression condition;
    }

    @Data
    public static class SetBlock {
        private String blockType;
    }

    @Data
    public static class SetBlockAtPos {
        private String blockType;
        private ImmutableVec3 blockOffset;
    }

    @Data
    public static class SpawnLoot {
        private String table;
    }

    @Data
    public static class Die {
        private Target target;
    }

    @Data
    public static class RunCommand {
        private List<String> command;
        private Target target;
    }

    @Data
    public static class Damage {
        private DamageType type;
        private double amount;
        private Target target;
    }

    @Data
    public static class DecrementStack {
        private boolean ignoreGameMode;
    }

    @Data
    public static class AddMobEffect {
        private EffectType effect;
        private Target target;
        private int duration;
        private int amplifier;
    }

    @Data
    public static class RemoveMobEffect {
        private EffectType effect;
        private Target target;
    }

    @Data
    public static class PlayEffect {
        private int data;
        private EntityEventDefinition.Target target;
        private String effect;
    }

    @Data
    public static class PlaySound {
        private EntityEventDefinition.Target target;
        private String sound;
    }

    @Data
    public static class Teleport {
        private Target target;
        private boolean avoidWater;
        private boolean landOnBlock;
        private ImmutableVec3 destination;
        private ImmutableVec3 maxRange;
    }

    @Data
    public static class TransformItem {
        private String transform;
    }

    @Data
    public static class RandomizeEntry {
        private int weight;
        private BlockEventDefinition event;

        @JsonCreator
        public void fromJson(ObjectNode node) {
            this.weight = node.remove("weight").asInt();
            this.event = BehaviorPackFactory.MAPPER.convertValue(node, BlockEventDefinition.class);
        }

        @JsonValue
        public ObjectNode toJson() {
            ObjectNode node = (ObjectNode) BehaviorPackFactory.toJsonNode(this.event);
            node.set("weight", BehaviorPackFactory.toJsonNode(this.weight));
            return node;
        }
    }

    public enum Target {
        SELF,
        OTHER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
