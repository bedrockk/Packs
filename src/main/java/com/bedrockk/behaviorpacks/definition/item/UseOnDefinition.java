package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UseOnDefinition implements ItemComponentNode {
	private List<String> blocks = new ArrayList<>();
}
