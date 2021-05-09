package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockFace;
import com.bedrockk.behaviorpacks.type.JsonList;
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
