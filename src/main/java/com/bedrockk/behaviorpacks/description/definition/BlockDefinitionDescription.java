package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.Description;
import com.bedrockk.behaviorpacks.type.BlockStateMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class BlockDefinitionDescription implements Description {
	private String identifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@JsonSince("1.16.100")
	private Map<String, BlockStateMap> properties;
}
