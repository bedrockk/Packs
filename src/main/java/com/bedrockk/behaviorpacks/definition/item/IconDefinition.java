package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class IconDefinition implements ItemComponentNode {
	private String texture;
	private ExpressionNode frame;
}
