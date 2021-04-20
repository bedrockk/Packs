package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class Chance {
    private double numerator;
    private double denominator;

    @JsonCreator
    public void fromJson(int chance) {
        this.numerator = chance;
        this.denominator = 100;
    }
}
