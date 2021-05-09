package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class RepairableDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onRepaired;
	private List<RepairItem> repairItems;

	@Data
	public static class RepairItem implements PackNode {
		private List<String> items;
		private ExpressionNode repairAmount;
	}
}
