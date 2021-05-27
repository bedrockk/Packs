package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ItemEventTriggerDefinition implements Definition {
	private String event;
	@Builder.Default
	private FilterTarget target = FilterTarget.SELF;
	private ExpressionNode condition;
}
