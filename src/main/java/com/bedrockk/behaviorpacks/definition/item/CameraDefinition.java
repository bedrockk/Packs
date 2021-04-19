package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

@Data
public class CameraDefinition implements ItemComponentDefinition {
    private double blackBarsDuration;
    private double blackBarsScreenRatio;
    private double shutterDuration;
    private int pictureDuration;
    private double slideAwayDuration;
}
