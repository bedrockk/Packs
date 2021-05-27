package com.bedrockk.packs.definition;

import com.bedrockk.packs.json.VersionPropertyDeserializer;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.AnimationEvent;
import com.bedrockk.packs.type.ConditionalEntry;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@Data
@Builder
@Jacksonized
public class AnimationControllerDefinition implements VersionedNode, Definition {
	@JsonDeserialize(using = VersionPropertyDeserializer.class)
	private SemVersion formatVersion;
	@Singular
	@JsonProperty("animation_controllers")
	private Map<String, Controller> controllers;

	@Data
	@Builder
	@Jacksonized
	public static class Controller implements PackNode {
		private String initialState;
		private Map<String, State> states;
	}

	@Data
	@Builder
	@Jacksonized
	public static class State implements PackNode {
		@Singular
		private List<ConditionalEntry> animations;
		@Singular
		private List<Map<String, ExpressionNode>> transitions;
		@Singular("entryEvent")
		private List<AnimationEvent> onEntry;
		@Singular("exitEvent")
		private List<AnimationEvent> onExit;
	}
}
