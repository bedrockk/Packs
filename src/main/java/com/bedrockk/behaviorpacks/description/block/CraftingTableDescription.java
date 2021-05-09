package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class CraftingTableDescription implements BlockDescription {
	private String customDescription;
	private int gridSize;
	private List<String> craftingTags;
}
