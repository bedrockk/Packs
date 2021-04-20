package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.BehaviorPackFactory;
import com.bedrockk.behaviorpacks.definition.FilterDefinition;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import com.bedrockk.behaviorpacks.type.DamageType;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.bedrockk.behaviorpacks.type.MolangExpression;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class ItemEventDefinition {
    private Swing swing;
    private Shoot shoot;
    private RunCommand runCommand;
    private Damage damage;
    private DecrementStack decrementStack;
    private AddMobEffect addMobEffect;
    private RemoveMobEffect removeMobEffect;
    private Teleport teleport;
    private TransformItem transformItem;

    private List<ItemEventDefinition> sequence;
    private List<RandomizeEntry> randomize;

    public static class Swing {
        // NOOP
    }

    @Data
    public static class Shoot {
        private String projectile;
        private double launchPower;
        private MolangExpression angleOffset;
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
        private ItemEventDefinition event;

        @JsonCreator
        public void fromJson(ObjectNode node) {
            this.weight = node.remove("weight").asInt();
            this.event = BehaviorPackFactory.MAPPER.convertValue(node, ItemEventDefinition.class);
        }

        @JsonValue
        public ObjectNode toJson() {
            ObjectNode node = (ObjectNode) BehaviorPackFactory.toJsonNode(this.event);
            node.set("weight", BehaviorPackFactory.toJsonNode(this.weight));
            return node;
        }
    }

    public enum Target {
        OTHER,
        HOLDER;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
