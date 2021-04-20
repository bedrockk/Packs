package com.bedrockk.behaviorpacks.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class FeatureCoordinate {
    private Pair<MolangExpression, MolangExpression> extent;
    private FeatureDistribution distribution;
    private Integer stepSize;
    private Integer gridOffset;

    @JsonCreator
    public void fromJson(MolangExpression expression) {
        this.extent = new Pair<>(new MolangExpression(0), expression);
        this.distribution = FeatureDistribution.GAUSSIAN;
    }
}
