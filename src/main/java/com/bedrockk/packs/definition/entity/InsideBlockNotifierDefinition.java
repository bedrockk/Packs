package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
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