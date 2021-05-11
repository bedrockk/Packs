package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.Description;
import com.bedrockk.packs.type.BlockStateMap;
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
