package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public record ChanceInformation(double numerator, double denominator) {
    @JsonCreator
    public static ChanceInformation fromJson(@JsonProperty("numerator") double numerator, @JsonProperty("denominator") double denominator) {
        return new ChanceInformation(numerator, denominator);
    }
}
