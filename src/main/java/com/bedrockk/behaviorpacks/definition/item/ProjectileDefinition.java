package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

@Data
public class ProjectileDefinition implements ItemComponentNode {
	private String projectileEntity;
	private int minimumCriticalPower = 1;
}
