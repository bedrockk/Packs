package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class IconDefinition implements ItemComponentNode {
	private String texture;
	private ExpressionNode frame;
}
