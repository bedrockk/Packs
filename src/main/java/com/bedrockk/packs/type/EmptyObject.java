package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class EmptyObject {
	public static final EmptyObject INSTANCE = new EmptyObject();

	@JsonValue
	public ObjectNode toJson() {
		return PackHelper.MAPPER.createObjectNode();
	}
}
