package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PhysicsDefinition implements EntityComponentDefinition {

	@Builder.Default
	private boolean hasCollision = true;
	@Builder.Default
	private boolean hasGravity = true;
}