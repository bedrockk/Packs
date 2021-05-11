package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class BlockPlacerDefinition implements ItemComponentNode {
	private String block;
	private boolean useBlockDescription = false;
	private List<String> useOn;
}