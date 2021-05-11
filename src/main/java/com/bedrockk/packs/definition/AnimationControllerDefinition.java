package com.bedrockk.packs.definition;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.AnimationEntry;
import com.bedrockk.packs.type.AnimationEvent;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

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
