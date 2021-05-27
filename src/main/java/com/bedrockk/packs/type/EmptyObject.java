package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class EmptyObject {
	public static final EmptyObject GET = new EmptyObject();
	private static final ObjectNode NODE = PackHelper.MAPPER.createObjectNode();

	@JsonValue
	public ObjectNode toJson() {
		return NODE;
	}
}
