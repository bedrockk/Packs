package com.bedrockk.packs.definition;

import com.bedrockk.packs.type.FilterOperator;
import com.bedrockk.packs.type.FilterTarget;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class EntityFilterDefinition implements Definition {
	@Singular("addAllOf")
	private List<EntityFilterDefinition> allOf;
	@Singular("addAnyOf")
	private List<EntityFilterDefinition> anyOf;
	@Singular("addNoneOf")
	private List<EntityFilterDefinition> noneOf;

	private String test;
	private String domain;
	@Builder.Default
	private FilterOperator operator = FilterOperator.EQUALS;
	@Builder.Default
	private FilterTarget subject = FilterTarget.SELF;
	private Object value;
	private String otherWithFamilies;
}
