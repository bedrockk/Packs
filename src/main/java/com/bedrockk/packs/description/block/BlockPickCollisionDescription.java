package com.bedrockk.packs.description.block;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.type.ImmutableVec3;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@JsonSince("1.16.100")
public class BlockPickCollisionDescription implements BlockDescription {
	private ImmutableVec3 origin;
	private ImmutableVec3 size;
	@JsonIgnore
	@Builder.Default
	private boolean hasCollision = true;

	@JsonCreator
	public static BlockPickCollisionDescription fromJson(boolean value) {
		return of(ImmutableVec3.ZERO, ImmutableVec3.ZERO, value);
	}

	@JsonValue
	public JsonNode toJson() {
		if (hasCollision) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set("origin", PackHelper.toJsonNode(origin));
			node.set("size", PackHelper.toJsonNode(size));
			return node;
		}
		return PackHelper.toJsonNode(false);
	}
}
