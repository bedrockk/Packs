package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class EmptyObject {
	public static final EmptyObject INSTANCE = new EmptyObject();

	@JsonValue
	public ObjectNode toJson() {
		return PackHelper.MAPPER.createObjectNode();
	}
}
