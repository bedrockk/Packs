package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class BlockPlacerDefinition implements ItemComponentNode {
	private String block;
	private boolean useBlockDescription = false;
}
