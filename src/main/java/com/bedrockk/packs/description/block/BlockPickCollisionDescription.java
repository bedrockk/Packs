package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
@JsonSince("1.16.100")
public class BlockPickCollisionDescription implements BlockDescription {
	private ImmutableVec3 origin;
	private ImmutableVec3 size;
	@JsonIgnore
	private boolean hasCollision;

	@JsonCreator
	public static BlockPickCollisionDescription fromJson(boolean value) {
		var desc = new BlockPickCollisionDescription();
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
