package com.bedrockk.packs.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public record ImmutableVec3(double x, double y, double z) {
	public static final ImmutableVec3 ZERO = new ImmutableVec3(0, 0, 0);

	@JsonCreator
	public static ImmutableVec3 of(double[] list) {
		return new ImmutableVec3(list[0], list[1], list[2]);
	}

	public static ImmutableVec3 of(double x, double y, double z) {
		return new ImmutableVec3(x, y, z);
	}

	@JsonValue
	public double[] toJson() {
		return new double[]{x, y, z};
	}
}
