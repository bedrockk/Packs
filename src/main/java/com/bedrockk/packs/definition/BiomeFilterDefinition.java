package com.bedrockk.packs.definition;

import com.bedrockk.packs.type.FilterOperator;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BiomeFilterDefinition implements Definition {
	@Singular("addAllOf")
	private List<BiomeFilterDefinition> allOf;
	@Singular("addAnyOf")
	private List<BiomeFilterDefinition> anyOf;

	private String test; // always "has_biome_tag"
	private FilterOperator operator;
	private String value;
}
