package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Data;

@Data
public class ParticleReference implements PackNode {
	private String particleType;
	private double particleYOffset;
	private boolean particleOffsetTowardsInteractor;
}
