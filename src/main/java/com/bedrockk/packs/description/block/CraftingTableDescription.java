package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class CraftingTableDescription implements BlockDescription {
	private String customDescription;
	private int gridSize;
	private List<String> craftingTags;
}
