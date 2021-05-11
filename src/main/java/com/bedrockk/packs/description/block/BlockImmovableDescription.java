package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.SingleValueNode;

@JsonSince("1.16.100")
public class BlockImmovableDescription extends SingleValueNode<Boolean> implements BlockDescription {
	public BlockImmovableDescription(Boolean value) {
		super(value);
	}
}
