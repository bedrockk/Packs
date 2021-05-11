package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
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
