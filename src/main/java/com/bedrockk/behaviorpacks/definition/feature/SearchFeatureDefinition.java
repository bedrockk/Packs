package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
public class SearchFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private BlockReference placesFeature;
    private SearchVolume searchVolume;
    private SearchAxis searchAxis;
    private Integer requiredSuccesses;

    @Data
    public static class SearchVolume {
        private ImmutableVec3 min;
        private ImmutableVec3 max;
    }

    @RequiredArgsConstructor
    public enum SearchAxis {
        MINUS_X("-x"),
        PLUS_X("+x"),
        MINUS_Y("-y"),
        PLUS_Y("+y"),
        MINUS_Z("-z"),
        PLUS_Z("+z");

        private final String value;

        @Override
        @JsonValue
        public String toString() {
            return this.value;
        }
    }
}
