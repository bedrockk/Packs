package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.type.ImmutableVec3;

@JsonSince("1.16.100")
public class BlockRotationDescription extends ImmutableVec3 implements BlockDescription {
	public BlockRotationDescription(double x, double y, double z) {
		super(x, y, z);
	}
}
