package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.DefinitionDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class ItemDefinitionDescription implements DefinitionDescription {
	private String identifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@JsonSince("1.16.100")
	private String category;
	@Singular
	private List<String> aliases;
}
