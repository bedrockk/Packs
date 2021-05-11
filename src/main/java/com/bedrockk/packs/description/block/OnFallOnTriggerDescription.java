package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class OnFallOnTriggerDescription extends BlockEventTriggerDescription {
	private double minFallDistance;
}
