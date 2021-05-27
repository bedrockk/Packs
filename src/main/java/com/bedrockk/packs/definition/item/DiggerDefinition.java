package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class DiggerDefinition implements ItemComponentNode {
	private boolean useEfficiency;
	private ItemEventTriggerDefinition onDig;
	@Singular
	private List<DestroySpeed> destroySpeeds;

	@Data
	@Builder
	@Jacksonized
	public static class DestroySpeed implements PackNode {
		private ItemSelector block;
		private int speed;
		private ItemEventTriggerDefinition onDig;
		private boolean useEfficiency;
	}
}
