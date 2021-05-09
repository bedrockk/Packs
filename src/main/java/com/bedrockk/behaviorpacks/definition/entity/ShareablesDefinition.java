package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class ShareablesDefinition implements EntityComponentDefinition {
	private boolean allItems = false;
	private int allItemsMaxAmount;
	private int allItemsSurplusAmount;
	private int allItemsWantAmount;
	private List<ItemEntry> items;

	@Data
	public static class ItemEntry implements PackNode {
		private int priority;
		private String item;
		private int itemAux;
		private String craftInto;
		private int maxAmount;
		private int wantAmount;
		private int surplusAmount;
		private int pickupLimit;
		private boolean admire;
		private boolean barter;
		private boolean consumeItem;
		private boolean storedInInventory;
	}
}