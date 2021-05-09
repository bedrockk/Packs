package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class OnFallOnTriggerDescription extends BlockEventTriggerDescription {
    private double minFallDistance;
}
