package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockFace;
import com.bedrockk.packs.type.JsonList;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class BlockPlacementFilterDescription implements BlockDescription {
	@Singular
	private List<Condition> conditions;

	@Data
	@Builder
	@Jacksonized
	public static class Condition implements PackNode {
		private String blockFilter;
		private JsonList<BlockFace> allowedFaces;
	}
}
