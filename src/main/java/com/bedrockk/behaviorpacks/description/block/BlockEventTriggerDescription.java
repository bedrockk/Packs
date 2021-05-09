package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

@Data
public class BlockEventTriggerDescription implements BlockDescription {
    private String event;
    private FilterTarget target = FilterTarget.SELF;
    private ExpressionNode condition;
}
