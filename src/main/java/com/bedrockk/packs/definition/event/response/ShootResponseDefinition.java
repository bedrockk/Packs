package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ShootResponseDefinition implements EventResponseDefinition {
	private String projectile;
	private double launchPower;
	private ExpressionNode angleOffset;
}