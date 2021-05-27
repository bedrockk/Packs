package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PushableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private Boolean isPushable = true;
	@Builder.Default
	private Boolean isPushableByPiston = true;
}