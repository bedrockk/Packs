package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.description.BlockDescription;
import lombok.Data;

import java.util.List;

@Data
public class DiggerDefinition implements ItemComponentDefinition {
    private boolean useEfficiency = false;
    private List<DestroySpeed> destroySpeeds;

    @Data
    public static class DestroySpeed {
        private BlockDescription block;
        private int speed;
    }
}
