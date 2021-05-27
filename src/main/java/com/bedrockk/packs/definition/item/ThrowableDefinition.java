package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class ThrowableDefinition implements ItemComponentNode {
	private boolean doSwingAnimation;
	private int maxDrawDuration;
	private boolean scalePowerByDrawDuration;
	private double launchPowerScale;
}
