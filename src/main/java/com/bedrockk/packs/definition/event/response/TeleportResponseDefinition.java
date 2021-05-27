package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class TeleportResponseDefinition implements EventResponseDefinition {
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
	private boolean avoidWater;
	private boolean landOnBlock;
	private ImmutableVec3 destination;
	private ImmutableVec3 maxRange;
}