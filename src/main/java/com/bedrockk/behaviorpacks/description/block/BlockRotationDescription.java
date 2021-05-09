package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;

@JsonSince("1.16.100")
public class BlockRotationDescription extends ImmutableVec3 implements BlockDescription {
	public BlockRotationDescription(double x, double y, double z) {
		super(x, y, z);
	}
}
