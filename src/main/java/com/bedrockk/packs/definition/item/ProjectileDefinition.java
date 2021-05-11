package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class ProjectileDefinition implements ItemComponentNode {
	private String projectileEntity;
	private double minimumCriticalPower = 1;
}
