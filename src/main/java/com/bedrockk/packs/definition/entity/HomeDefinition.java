package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class HomeDefinition implements EntityComponentDefinition {
	@JsonSince("1.16.100")
	private int restrictionRadius;
}