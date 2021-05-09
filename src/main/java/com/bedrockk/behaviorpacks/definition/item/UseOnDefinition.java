package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonUntil;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.List;

@Data
@JsonUntil("1.16.100")
public class UseOnDefinition implements ItemComponentNode {
	private List<String> blocks;
}
