package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class WeaponDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onHurtEntity;
	private ItemEventTriggerDefinition onNotHurtEntity;
	private ItemEventTriggerDefinition onHitBlock;
}
