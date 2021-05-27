package com.bedrockk.packs.definition;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.EntityMaterialType;
import com.bedrockk.packs.type.ExpressionNode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@Jacksonized
public class AttachableDefinition extends VersionedDefinition {
	private Description description;

	@Data
	@Builder
	@Jacksonized
	public static class Description implements PackNode {
		private String identifier;
		@Singular
		@JsonProperty("item")
		private Map<String, ExpressionNode> items;
		@Singular
		private Map<String, EntityMaterialType> materials;
		@Singular
		private Map<String, Path> textures;
		@Singular
		@JsonProperty("geometry")
		private Map<String, String> geometries;
		private Scripts scripts;
		@Singular
		private List<String> renderControllers;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Scripts implements PackNode {
		@Singular
		@JsonProperty("preAnimation")
		private List<ExpressionNode> preAnimations;
		private ExpressionNode parentSetup;
	}
}
