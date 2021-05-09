package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class InsideBlockNotifierDefinition implements EntityComponentDefinition {
	private List<BlockEntry> blockList;

	@Data
	public static class BlockEntry implements PackNode {
		private BlockReference block;
		private EntityEventTriggerDefinition enteredBlockEvent;
		private EntityEventTriggerDefinition exitedBlockEvent;
	}
}