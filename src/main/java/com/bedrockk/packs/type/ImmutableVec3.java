package com.bedrockk.packs.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public class ImmutableVec3 {
	private final double x;
	private final double y;
	private final double z;

	@JsonCreator
	public static ImmutableVec3 fromJson(List<Double> list) {
		return new ImmutableVec3(list.get(0), list.get(1), list.get(2));
	}

	@JsonValue
	public List<Double> toJson() {
		return Arrays.asList(this.x, this.y, this.z);
	}
}
