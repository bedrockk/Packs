package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Data;

@Data
public class HomeDefinition implements EntityComponentDefinition {
	@JsonSince("1.16.100")
	private int restrictionRadius;
}