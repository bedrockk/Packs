package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class OnUseOnDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onUseOn;
}
