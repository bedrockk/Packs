package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import com.bedrockk.behaviorpacks.type.DamageType;
import com.bedrockk.behaviorpacks.type.EffectType;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class EntityEventDefinition {
    private String trigger; // custom event
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
    public static class RunCommand {
        private List<String> command;
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

    public static class Die {
        // NOOP
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
        private Target target;
        private String effect;
    }

    @Data
    public static class PlaySound {
        private Target target;
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
    public static class SequenceEntry {
        private EntityFilterDefinition filters;
        private EntityEventDefinition event;

        @JsonCreator
        public void fromJson(ObjectNode node) {
            this.filters = PackHelper.MAPPER.convertValue(node.remove("filters"), EntityFilterDefinition.class);
            this.event = PackHelper.MAPPER.convertValue(node, EntityEventDefinition.class);
        }

        @JsonValue
        public ObjectNode toJson() {
            ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
            node.set("filters", PackHelper.toJsonNode(this.filters));
            return node;
        }
    }

    @Data
    public static class RandomizeEntry {
        private int weight;
        private EntityEventDefinition event;

        @JsonCreator
        public void fromJson(ObjectNode node) {
            this.weight = node.remove("weight").asInt();
            this.event = PackHelper.MAPPER.convertValue(node, EntityEventDefinition.class);
        }

        @JsonValue
        public ObjectNode toJson() {
            ObjectNode node = (ObjectNode) PackHelper.toJsonNode(this.event);
            node.set("weight", PackHelper.toJsonNode(this.weight));
            return node;
        }
    }

    @Data
    public static class Add {
        private List<String> componentGroups;
        private AddMobEffect spellEffects;
        private List<EntityComponentNode> group;
    }

    @Data
    public static class Remove {
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
