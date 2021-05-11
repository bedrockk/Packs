package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.List;

@Data
@JsonUntil("1.16.100")
public class UseOnDefinition implements ItemComponentNode {
	private List<String> blocks;
}
