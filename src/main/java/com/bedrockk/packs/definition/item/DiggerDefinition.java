package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class DiggerDefinition implements ItemComponentNode {
	private boolean useEfficiency;
	private ItemEventTriggerDefinition onDig;
	private List<DestroySpeed> destroySpeeds;

	@Data
	public static class DestroySpeed implements PackNode {
		private ItemSelector block;
		private int speed;
		private ItemEventTriggerDefinition onDig;
		private boolean useEfficiency;
	}
}
