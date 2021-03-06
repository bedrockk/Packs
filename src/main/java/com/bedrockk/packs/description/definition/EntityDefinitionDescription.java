package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.description.DefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ConditionalEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@Data
@Builder
@Jacksonized
public class EntityDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private String runtimeIdentifier;
	@JsonProperty("is_experimental")
	private boolean experimental;
	@JsonProperty("is_spawnable")
	private boolean spawnable;
	@JsonProperty("is_summonable")
	private boolean summonable;
	@Singular
	private Map<String, String> animations;
	private Scripts scripts;

	@Data
	@Builder
	@Jacksonized
	public static class Scripts implements PackNode {
		@Singular("add")
		private final List<ConditionalEntry> animate;
	}
}
