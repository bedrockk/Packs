package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.definition.Definition;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.FilterTarget;
import lombok.Data;

@Data
public class ItemEventTriggerDefinition implements Definition {
	private String event;
	private FilterTarget target = FilterTarget.SELF;
	private ExpressionNode condition;
}
