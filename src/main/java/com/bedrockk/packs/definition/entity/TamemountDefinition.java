package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TamemountDefinition implements EntityComponentDefinition {

	@Builder.Default
	private int attemptTemperMod = 5;
	@Singular
	private List<ItemEntry> autoRejectItems;
	@Singular
	private List<FeedItemEntry> feedItems;
	private String feedText;
	@Builder.Default
	private int maxTemper = 100;
	private int minTemper;
	private String rideText;
	private EntityEventTriggerDefinition tameEvent;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class ItemEntry implements PackNode {
		private ItemSelector item;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class FeedItemEntry extends ItemEntry {
		private int temperMod;
	}
}