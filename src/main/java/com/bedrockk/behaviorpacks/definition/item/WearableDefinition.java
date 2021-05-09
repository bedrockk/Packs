package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import lombok.Data;

@Data
public class WearableDefinition implements ItemComponentNode {
	private SlotType slot;
}
