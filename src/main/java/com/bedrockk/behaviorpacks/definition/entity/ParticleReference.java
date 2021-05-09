package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

@Data
public class ParticleReference implements PackNode {
	private String particleType;
	private double particleYOffset;
	private boolean particleOffsetTowardsInteractor;
}
