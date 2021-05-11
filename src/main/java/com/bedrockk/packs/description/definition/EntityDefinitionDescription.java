package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.description.DefinitionDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class EntityDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private String runtimeIdentifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@JsonProperty("is_spawnable")
	private boolean spawnable;
	@JsonProperty("is_summonable")
	private boolean summonable;
	private Map<String, String> animations;
	private String scripts;
}
