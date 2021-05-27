package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.type.ItemSelector;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BribeableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private double bribeCooldown = 2.0;
	@Singular
	private List<ItemSelector> bribeItems;
}