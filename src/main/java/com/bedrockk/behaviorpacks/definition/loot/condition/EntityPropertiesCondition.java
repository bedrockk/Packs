package com.bedrockk.behaviorpacks.definition.loot.condition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableCondition;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

@Data
public class EntityPropertiesCondition implements LootTableCondition {
	private String entity; // always "this"
	private Properties properties;

	public static class Properties implements PackNode {
		private boolean onFire;
		// stands for future
	}
}
