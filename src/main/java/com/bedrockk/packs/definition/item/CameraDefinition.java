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
public class CameraDefinition implements ItemComponentNode {
	private double blackBarsDuration;
	private double blackBarsScreenRatio;
	private double shutterDuration;
	private int pictureDuration;
	private double slideAwayDuration;
}
