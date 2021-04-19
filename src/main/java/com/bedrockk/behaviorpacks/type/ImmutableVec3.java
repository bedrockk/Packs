package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;

import java.util.Arrays;
import java.util.List;

@Value
public class ImmutableVec3 {
    double x;
    double y;
    double z;

    @JsonCreator
    public static ImmutableVec3 fromJson(List<Double> list) {
        return new ImmutableVec3(list.get(0), list.get(1), list.get(2));
    }

    @JsonValue
    public List<Double> toJson() {
        return Arrays.asList(this.x, this.y, this.z);
    }
}
