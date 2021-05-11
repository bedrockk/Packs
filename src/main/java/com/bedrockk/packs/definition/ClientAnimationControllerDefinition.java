package com.bedrockk.packs.definition;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ClientAnimationControllerDefinition implements Definition {
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
		private TimeMap<Double> blendTransition;
		private boolean blendViaShortestPath;
		private List<ExpressionNode> parameters;
		private Map<String, Variable> variables;
		private List<AnimationEntry> animations;
		private List<Map<String, ExpressionNode>> transitions;
		private List<Particle> particleEffects;
		private List<Sound> soundEffects;
	}

	@Data
	public static class Variable implements PackNode {
		private ExpressionNode input;
		private Map<String, Double> remapCurve;
	}

	@Data
	public static class Particle implements PackNode {
		private String effect;
		private String locator;
		private ExpressionNode preEffectScript;
		private boolean bindToActor;
	}

	@Data
	public static class Sound implements PackNode {
		private String effect;
	}
}
