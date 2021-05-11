package com.bedrockk.packs.description.block;

import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Data;

@Data
public class BlockEventTriggerDescription implements BlockDescription {
	private String event;
	private FilterTarget target = FilterTarget.SELF;
	private ExpressionNode condition;
}
