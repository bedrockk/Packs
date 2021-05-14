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
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class RenderControllerDefinition implements VersionedNode, Definition {
	@JsonDeserialize(using = VersionPropertyDeserializer.class)
	private SemVersion formatVersion;
	@JsonProperty("render_controllers")
	private Map<String, Controller> controllers;

	@Data
	public static class Controller implements PackNode {
		private boolean rebuildAnimationMatrices;
		private boolean ignoreLightning;
		private boolean filterLightning;
		private double lightColorMultiplier;
		private String geometry;
		private List<ExpressionNode> partyVisibility;
		private List<Map<String, String>> materials;
		private List<String> textures;
		private DynamicColor color;
		private DynamicColor overlayColor;
		private DynamicColor onFireColor;
		private DynamicColor isHurtColor;
		private UVAnim uvAnim;
		private Arrays arrays;
	}

	@Data
	public static class UVAnim implements PackNode {
		private Pair<ExpressionNode, ExpressionNode> offset;
		private Pair<ExpressionNode, ExpressionNode> scale;
	}

	@Data
	public static class Arrays implements PackNode {
		private Map<String, List<String>> geometries;
		private Map<String, List<String>> materials;
		private Map<String, List<String>> textures;
	}
}
