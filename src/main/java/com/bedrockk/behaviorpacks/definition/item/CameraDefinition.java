package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class CameraDefinition implements ItemComponentNode {
    private double blackBarsDuration;
    private double blackBarsScreenRatio;
    private double shutterDuration;
    private int pictureDuration;
    private double slideAwayDuration;
}
