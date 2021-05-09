package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FilterOperator {
	EQUALS("=="),
	NOT_EQUALS("!="),
	SMALLER("<"),
	SMALLER_OR_EQUALS("<="),
	NOT_EQUALS_2("<>"),
	EQUALS_SHORT("="),
	GREATER(">"),
	GREATER_OR_EQUALS(">="),
	LOGICAL_EQUALS("equals"),
	LOGICAL_NOT_EQUALS("not");

	private final String symbol;

	@JsonValue
	public String getSymbol() {
		return symbol;
	}
}