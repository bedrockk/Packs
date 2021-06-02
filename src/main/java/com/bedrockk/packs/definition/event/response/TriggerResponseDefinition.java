package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.definition.event.EventResponseTarget;
import com.bedrockk.packs.type.ExpressionNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class TriggerResponseDefinition implements EventResponseDefinition {
	private String event;
	@Builder.Default
	private EventResponseTarget target = EventResponseTarget.SELF;
	private ExpressionNode condition;

	@JsonCreator
	public static TriggerResponseDefinition of(String event) {
		return new TriggerResponseDefinition(event, EventResponseTarget.SELF, null);
	}
}
