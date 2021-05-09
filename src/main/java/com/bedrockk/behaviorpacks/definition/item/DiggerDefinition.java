package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ItemSelector;
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
