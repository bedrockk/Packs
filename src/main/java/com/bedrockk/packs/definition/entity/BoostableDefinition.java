package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BoostableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double speedMultiplier = 1.0;
	@Builder.Default
	private double duration = 3.0;
	@Singular
	private List<BoostItem> boostItems;

	@Data
	@Builder
	@Jacksonized
	public static class BoostItem implements PackNode {
		private String item;
		private int itemDamage;
		private String replaceItem;
	}
}