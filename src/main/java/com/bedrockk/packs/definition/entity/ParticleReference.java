package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ParticleReference implements PackNode {
	private String particleType;
	private double particleYOffset;
	private boolean particleOffsetTowardsInteractor;
}
