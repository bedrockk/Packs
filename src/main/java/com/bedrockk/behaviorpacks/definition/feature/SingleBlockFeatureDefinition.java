package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.JsonList;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SingleBlockFeatureDefinition extends FeatureDefinition {
    private Map<String, DefinitionDescription> description;
    private BlockReference placesBlock;
    private boolean enforcePlacementRules;
    private boolean enforceSurvivabilityRules;
    private MayAttachTo mayAttachTo;
    private List<BlockReference> mayReplace;

    @Data
    public static class MayAttachTo {
        private Integer minSidesMustAttach;
        private Boolean autoRotate;
        private JsonList<BlockReference> top;
        private JsonList<BlockReference> bottom;
        private JsonList<BlockReference> north;
        private JsonList<BlockReference> east;
        private JsonList<BlockReference> south;
        private JsonList<BlockReference> west;
        private JsonList<BlockReference> all;
        private JsonList<BlockReference> sides;
    }
}
