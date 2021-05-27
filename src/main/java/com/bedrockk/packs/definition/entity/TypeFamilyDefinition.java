package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TypeFamilyDefinition implements EntityComponentDefinition {
	@Singular("familyType")
	private List<String> family;
}