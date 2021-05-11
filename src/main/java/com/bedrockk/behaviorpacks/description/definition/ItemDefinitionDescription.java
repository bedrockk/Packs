package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemDefinitionDescription implements DefinitionDescription {
	private String identifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@JsonSince("1.16.100")
	private String category;
}
