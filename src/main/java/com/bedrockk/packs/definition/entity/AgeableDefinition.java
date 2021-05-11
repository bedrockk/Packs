package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class AgeableDefinition implements EntityComponentDefinition {
	private double duration = 1200.0;
	private List<FeedItem> feedItems;
	private List<String> dropItems;
	private EntityEventTriggerDefinition growUp;

	@Data
	public static class FeedItem implements PackNode {
		private ItemSelector item;
		private double growth;
	}
}