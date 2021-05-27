package com.bedrockk.packs.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public record ChanceInformation(ExpressionNode chance) {
	@JsonCreator
	public static ChanceInformation of(@JsonProperty("numerator") int numerator, @JsonProperty("denominator") int denominator) {
		return new ChanceInformation(new ExpressionNode(numerator / denominator));
	}

	@JsonCreator
	public static ChanceInformation of(String value) {
		return new ChanceInformation(new ExpressionNode(value));
	}
}
