package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class BlockPreventsJumpingDescription extends SingleValueNode<Boolean> implements BlockDescription {
	public BlockPreventsJumpingDescription(Boolean value) {
		super(value);
	}
}
