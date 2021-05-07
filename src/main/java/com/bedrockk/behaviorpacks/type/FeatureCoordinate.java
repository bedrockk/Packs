package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class FeatureCoordinate implements PackNode {
    private Pair<ExpressionNode, ExpressionNode> extent;
    private FeatureDistribution distribution;
    private Integer stepSize;
    private Integer gridOffset;

    @JsonCreator
    public void fromJson(ExpressionNode expression) {
        this.extent = new Pair<>(new ExpressionNode(0), expression);
        this.distribution = FeatureDistribution.GAUSSIAN;
    }
}
