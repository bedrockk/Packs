package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.SingleValueNode;
import com.bedrockk.packs.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonSince("1.16.100")
public class BlockRotationDescription extends SingleValueNode<ImmutableVec3> implements BlockDescription {
	@JsonCreator
	public BlockRotationDescription(ImmutableVec3 value) {
		super(value);
	}
}
