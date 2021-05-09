package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class BlockEntityCollisionDescription implements BlockDescription {
	private ImmutableVec3 origin;
	private ImmutableVec3 size;
	@JsonIgnore
	private boolean hasCollision;

	@JsonCreator
	public static BlockEntityCollisionDescription fromJson(boolean value) {
		var desc = new BlockEntityCollisionDescription();
		desc.hasCollision = value;
		return desc;
	}

	@JsonValue
	public JsonNode toJson() {
		if (hasCollision) {
			return PackHelper.toJsonNode(true);
		} else {
			return PackHelper.toJsonNode(this);
		}
	}
}
