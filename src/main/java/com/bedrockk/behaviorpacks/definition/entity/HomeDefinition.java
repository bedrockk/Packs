package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import lombok.Data;

@Data
public class HomeDefinition implements EntityComponentDefinition{
	@JsonSince("1.16.100")
	private int restrictionRadius;
}