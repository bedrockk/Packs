package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PlayEffectResponseDefinition implements EventResponseDefinition {
	private int data;
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
	private String effect;
}