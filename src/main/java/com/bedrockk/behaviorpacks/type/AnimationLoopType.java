package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

public enum AnimationLoopType {
	TRUE,
	FALSE,
	HOLD_ON_LAST_FRAME;

	@JsonCreator
	public static AnimationLoopType fromJson(JsonNode node) {
		if (node.isBoolean()) {
			return node.asBoolean() ? TRUE : FALSE;
		}
		return HOLD_ON_LAST_FRAME;
	}

	@JsonValue
	public JsonNode toJson() {
		if (equals(TRUE) || equals(FALSE)) {
			return PackHelper.toJsonNode(equals(TRUE));
		}
		return PackHelper.toJsonNode("hold_on_last_frame");
	}
}