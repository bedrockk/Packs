package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.AnimationEntry;
import com.bedrockk.behaviorpacks.type.AnimationEvent;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Data
public class AnimationControllerDefinition implements Definition {
	private SemVersion formatVersion;
	@JsonProperty("animation_controllers")
	private Map<String, Controller> controllers;

	@Data
	public static class Controller implements PackNode {
		private String initialState;
		private Map<String, State> states;
	}

	@Data
	public static class State implements PackNode {
		private List<AnimationEntry> animations;
		private List<Map<String, ExpressionNode>> transitions;
		private List<AnimationEvent> onEntry;
		private List<AnimationEvent> onExit;
	}
}
