package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class JumpStaticDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double jumpPower = 0.42;
}