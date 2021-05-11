package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.type.SlotType;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class WearableDefinition implements ItemComponentNode {
	private SlotType slot;
	private boolean dispensable;
}
