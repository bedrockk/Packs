package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import com.bedrockk.packs.node.PackNode;
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
