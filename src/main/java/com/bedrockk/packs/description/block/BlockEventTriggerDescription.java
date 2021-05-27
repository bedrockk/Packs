package com.bedrockk.packs.description.block;

import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
public class BlockEventTriggerDescription implements BlockDescription {
	private String event;
	@Builder.Default
	private FilterTarget target = FilterTarget.SELF;
	private ExpressionNode condition;
}
