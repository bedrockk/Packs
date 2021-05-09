package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import lombok.Data;

@Data
@JsonSince("1.17.0")
public class HangingEntityDefinition implements ItemComponentNode {
	private int actorType;
}
