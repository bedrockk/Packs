package com.bedrockk.packs.definition;

import com.bedrockk.packs.type.FilterOperator;
import lombok.Data;

import java.util.List;

@Data
public class BiomeFilterDefinition implements Definition {
	private List<BiomeFilterDefinition> allOf;
	private List<BiomeFilterDefinition> anyOf;

	private String test; // always "has_biome_tag"
	private FilterOperator operator;
	private String value;
}
