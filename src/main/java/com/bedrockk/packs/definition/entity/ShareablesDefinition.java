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
public class ShareablesDefinition implements EntityComponentDefinition {
	private boolean allItems;
	private int allItemsMaxAmount;
	private int allItemsSurplusAmount;
	private int allItemsWantAmount;
	@Singular
	private List<ItemEntry> items;

	@Data
	@Builder
	@Jacksonized
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