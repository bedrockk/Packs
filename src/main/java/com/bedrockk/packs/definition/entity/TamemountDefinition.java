package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class TamemountDefinition implements EntityComponentDefinition {

	private int attemptTemperMod = 5;
	private List<ItemEntry> autoRejectItems;
	private List<FeedItemEntry> feedItems;
	private String feedText;
	private int maxTemper = 100;
	private int minTemper = 0;
	private String rideText;
	private EntityEventTriggerDefinition tameEvent;

	@Data
	public static class ItemEntry implements PackNode {
		private ItemSelector item;
	}

	@Data
	public static class FeedItemEntry extends ItemEntry {
		private int temperMod;
	}
}