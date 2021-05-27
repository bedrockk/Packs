package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.Range;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TimerDefinition implements EntityComponentDefinition {
	@Builder.Default
	private boolean looping = true;
	@Builder.Default
	private boolean randomInterval = true;
	private Range time;
	@Singular
	private List<RandomTimeChoice> randomTimeChoices;
	private EntityEventTriggerDefinition timeDownEvent;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class RandomTimeChoice implements PackNode {
		private int weight;
		private int value;
	}
}