package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.type.BlockSelector;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.Data;

import java.util.List;

@Data
public class DiggerDefinition implements ItemComponentNode {
    private boolean useEfficiency = false;
    private List<DestroySpeed> destroySpeeds;

    @Data
    public static class DestroySpeed {
        private BlockSelector block;
        private int speed;
    }
}
