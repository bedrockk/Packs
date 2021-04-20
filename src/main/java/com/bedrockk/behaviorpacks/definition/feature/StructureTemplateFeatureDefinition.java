package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.EmptyObject;
import lombok.Data;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
public class StructureTemplateFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private String structureName;
    private Integer adjustmentRadius;
    private FacingDirection facingDirection;

    @Data
    public static class Constraints {
        private EmptyObject grounded;
        private EmptyObject unburied;
        private BlockIntersection blockIntersection;
    }

    @Data
    public static class BlockIntersection {
        private List<BlockReference> blockAllowList; // blockWhiteList for < 1.16.100
    }

    public enum FacingDirection {
        NORTH,
        SOUTH,
        EAST,
        WEST,
        RANDOM;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
