package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import com.bedrockk.packs.type.EffectType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class AddMobEffectResponseDefinition implements EventResponseDefinition {
	private EffectType effect;
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
	private int duration;
	private int amplifier;
}