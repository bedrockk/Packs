package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class RepairableDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onRepaired;
	@Singular
	private List<RepairItem> repairItems;

	@Data
	@Builder
	@Jacksonized
	public static class RepairItem implements PackNode {
		@Singular
		private List<String> items;
		private ExpressionNode repairAmount;
	}
}
