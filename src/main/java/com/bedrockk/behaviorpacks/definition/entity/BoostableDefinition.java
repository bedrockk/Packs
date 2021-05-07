package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class BoostableDefinition implements EntityComponentDefinition{
	private double speedMultiplier = 1.0;
	private double duration = 3.0;
	private List<BoostItem> boostItems;

	@Data
	public static class BoostItem implements PackNode {
		private String item;
		private int itemDamage;
		private String replaceItem;
	}
}