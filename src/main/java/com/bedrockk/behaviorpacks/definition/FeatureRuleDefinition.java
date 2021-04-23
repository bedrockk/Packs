package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Locale;
import java.util.Map;

@Data
public class FeatureRuleDefinition extends VersionedDefinition {
    private Map<String, DefinitionDescription> description;
    private Conditions conditions;
    private Distribution distribution;

    @Data
    public static class Conditions {
        private PlacementPass placementPass;
        @JsonProperty("minecraft:biome_filter")
        private JsonList<BiomeFilterDefinition> filters;
    }

    @Data
    public static class Distribution {
        private MolangExpression iterations;
        private Chance scatterChance;
        private CoordinateEvalOrderType coordinateEvalOrder;
        private FeatureCoordinate x;
        private FeatureCoordinate y;
        private FeatureCoordinate z;
    }

    public enum PlacementPass {
        FIRST_PASS,
        BEFORE_UNDERGROUND_PASS,
        UNDERGROUND_PASS,
        AFTER_UNDERGROUND_PASS,
        BEFORE_SURFACE_PASS,
        SURFACE_PASS,
        AFTER_SURFACE_PASS,
        BEFORE_LIQUIDS_PASS,
        LIQUIDS_PASS,
        AFTER_LIQUIDS_PASS,
        BEFORE_SKY_PASS,
        SKY_PASS,
        AFTER_SKY_PASS,
        FINAL_PASS;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
