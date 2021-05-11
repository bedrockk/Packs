package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class BlockRandomTickingDescription implements BlockDescription {
	private BlockEventTriggerDescription onTick;
}
