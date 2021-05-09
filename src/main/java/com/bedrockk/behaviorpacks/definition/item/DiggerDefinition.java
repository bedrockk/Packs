package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class DiggerDefinition implements ItemComponentNode {
	private boolean useEfficiency = false;
	private List<DestroySpeed> destroySpeeds;

	@Data
	public static class DestroySpeed implements PackNode {
		private ItemSelector block;
		private int speed;
	}
}
