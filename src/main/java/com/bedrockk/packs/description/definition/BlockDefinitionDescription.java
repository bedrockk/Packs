package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.Description;
import com.bedrockk.packs.type.BlockStateMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Data
@Builder
@Jacksonized
public class BlockDefinitionDescription implements Description {
	private String identifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@Singular
	@JsonSince("1.16.100")
	private Map<String, BlockStateMap> properties;
}
