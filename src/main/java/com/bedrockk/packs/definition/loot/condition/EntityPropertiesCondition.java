package com.bedrockk.packs.definition.loot.condition;

import com.bedrockk.packs.definition.loot.LootTableCondition;
import com.bedrockk.packs.node.PackNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class EntityPropertiesCondition implements LootTableCondition {
	private String entity = "this"; // always "this"
	private Properties properties;

	@Data
	@Builder
	@Jacksonized
	public static class Properties implements PackNode {
		private boolean onFire;
		// stands for future
	}
}
