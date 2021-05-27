package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class InsideBlockNotifierDefinition implements EntityComponentDefinition {
	@Singular("entry")
	private List<BlockEntry> blockList;

	@Data
	@Builder
	@Jacksonized
	public static class BlockEntry implements PackNode {
		private BlockReference block;
		private EntityEventTriggerDefinition enteredBlockEvent;
		private EntityEventTriggerDefinition exitedBlockEvent;
	}
}