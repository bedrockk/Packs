package com.bedrockk.packs.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public record AnimationEvent(int type, Object event) {
	public static final int TYPE_ENTITY_EVENT = 0;
	public static final int TYPE_COMMAND = 1;
	public static final int TYPE_EXPRESSION = 2;

	@JsonCreator
	public static AnimationEvent fromJson(String event) {
		if (event.startsWith("@s ")) {
			return new AnimationEvent(TYPE_ENTITY_EVENT, event.substring(3));
		} else if (event.startsWith("/")) {
			return new AnimationEvent(TYPE_COMMAND, event.substring(1));
		} else {
			return new AnimationEvent(TYPE_EXPRESSION, new ExpressionNode(event));
		}
	}

	@JsonValue
	public String toJson() {
		if (this.type == TYPE_ENTITY_EVENT) {
			return "@s " + this.event;
		} else if (this.type == TYPE_COMMAND) {
			return "/" + this.event;
		}

		return this.event.toString();
	}

	public String asString() {
		return (String) this.event;
	}

	public ExpressionNode asExpression() {
		return (ExpressionNode) this.event;
	}
}