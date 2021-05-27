package com.bedrockk.packs.definition;

import com.bedrockk.packs.json.VersionPropertyDeserializer;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.DynamicColor;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.Pair;
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
public class RenderControllerDefinition implements VersionedNode, Definition {
	@JsonDeserialize(using = VersionPropertyDeserializer.class)
	private SemVersion formatVersion;
	@Singular
	@JsonProperty("render_controllers")
	private Map<String, Controller> controllers;

	@Data
	@Builder
	@Jacksonized
	public static class Controller implements PackNode {
		private boolean rebuildAnimationMatrices;
		private boolean ignoreLightning;
		private boolean filterLightning;
		private double lightColorMultiplier;
		private ExpressionNode geometry;
		@Singular("visibility")
		private List<ExpressionNode> partVisibility;
		@Singular
		private List<Map<String, ExpressionNode>> materials;
		@Singular
		private List<ExpressionNode> textures;
		private DynamicColor color;
		private DynamicColor overlayColor;
		private DynamicColor onFireColor;
		private DynamicColor isHurtColor;
		private UVAnim uvAnim;
		private Arrays arrays;
	}

	@Data
	@Builder
	@Jacksonized
	public static class UVAnim implements PackNode {
		private Pair<ExpressionNode, ExpressionNode> offset;
		private Pair<ExpressionNode, ExpressionNode> scale;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Arrays implements PackNode {
		@Singular
		private Map<String, List<String>> geometries;
		@Singular
		private Map<String, List<String>> materials;
		@Singular
		private Map<String, List<String>> textures;
	}
}
