package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.List;

@Data
public class DiggerDefinition implements ItemComponentNode {
    private boolean useEfficiency = false;
    private List<DestroySpeed> destroySpeeds;

    @Data
    public static class DestroySpeed {
        private BlockDescription block;
        private int speed;
    }
}
