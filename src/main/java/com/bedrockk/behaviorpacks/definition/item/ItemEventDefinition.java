package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.Definition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class ItemEventDefinition implements Definition {
    private EmptyObject swing;
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

    @Data
    public static class Shoot implements PackNode {
        private String projectile;
        private double launchPower;
        private ExpressionNode angleOffset;
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
        private ItemEventDefinition event;

        @JsonCreator
        public void fromJson(ObjectNode node) {
            this.weight = node.remove("weight").asInt();
            this.event = PackHelper.MAPPER.convertValue(node, ItemEventDefinition.class);
        }

        @JsonValue
        public ObjectNode toJson() {
            ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
            node.set("weight", PackHelper.toJsonNode(this.weight));
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
