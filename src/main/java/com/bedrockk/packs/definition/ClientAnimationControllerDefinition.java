package com.bedrockk.packs.definition;

import com.bedrockk.packs.json.VersionPropertyDeserializer;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.ConditionalEntry;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.type.TimeMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@Data
@Builder
@Jacksonized
public class ClientAnimationControllerDefinition implements VersionedNode, Definition {
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
		@Singular
		private Map<String, State> states;
	}

	@Data
	@Builder
	@Jacksonized
	public static class State implements PackNode {
		private TimeMap<Double> blendTransition;
		private boolean blendViaShortestPath;
		@Singular
		private List<ExpressionNode> parameters;
		@Singular
		private Map<String, Variable> variables;
		@Singular
		private List<ConditionalEntry> animations;
		@Singular
		private List<Map<String, ExpressionNode>> transitions;
		@Singular
		private List<Particle> particleEffects;
		@Singular
		private List<Sound> soundEffects;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Variable implements PackNode {
		private ExpressionNode input;
		@Singular("putRemapCurve")
		private Map<String, Double> remapCurve;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Particle implements PackNode {
		private String effect;
		private String locator;
		private ExpressionNode preEffectScript;
		private boolean bindToActor;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Sound implements PackNode {
		private String effect;
	}
}
