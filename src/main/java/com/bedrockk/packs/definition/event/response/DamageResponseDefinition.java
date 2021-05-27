package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import com.bedrockk.packs.type.DamageSourceType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class DamageResponseDefinition implements EventResponseDefinition {
	private DamageSourceType type;
	private double amount;
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
}