package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

@Data
public class ItemEventTriggerDefinition implements Definition {
	private String event;
	private FilterTarget target = FilterTarget.SELF;
	private ExpressionNode condition;
}
