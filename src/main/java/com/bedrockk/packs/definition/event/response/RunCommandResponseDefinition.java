package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RunCommandResponseDefinition implements EventResponseDefinition {
	@Singular("run")
	private List<String> command;
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
}