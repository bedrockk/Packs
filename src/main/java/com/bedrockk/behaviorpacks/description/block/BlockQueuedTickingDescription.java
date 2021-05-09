package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class BlockQueuedTickingDescription implements BlockDescription {
	private boolean looping;
	private Range range;
	private BlockEventTriggerDescription onTick;
}
