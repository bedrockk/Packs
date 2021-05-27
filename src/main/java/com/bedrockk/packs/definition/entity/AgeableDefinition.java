package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class AgeableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double duration = 1200.0;
	@Singular
	private List<FeedItem> feedItems;
	@Singular
	private List<String> dropItems;
	private EntityEventTriggerDefinition growUp;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class FeedItem implements PackNode {
		private ItemSelector item;
		private double growth;
	}
}