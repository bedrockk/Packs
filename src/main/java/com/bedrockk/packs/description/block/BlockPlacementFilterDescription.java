package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockFace;
import com.bedrockk.packs.type.JsonList;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
public class BlockPlacementFilterDescription implements BlockDescription {
	private List<Condition> conditions;

	@Data
	public static class Condition implements PackNode {
		private String blockFilter;
		private JsonList<BlockFace> allowedFaces;
	}
}
