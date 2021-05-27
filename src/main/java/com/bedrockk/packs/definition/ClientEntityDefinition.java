package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
@SuperBuilder
@Jacksonized
public class ClientEntityDefinition extends VersionedDefinition {
	private Description description;

	@Data
	@Builder
	@Jacksonized
	public static class Description implements PackNode {
		private String identifier;
		private SemVersion minEngineVersion;
		private boolean enableAttachables;
		private SpawnEgg spawnEgg;
		@Singular
		private Map<String, EntityMaterialType> materials;
		@Singular
		private Map<String, Path> textures;
		@Singular
		@JsonProperty("geometry")
		private Map<String, String> geometries;
		@Singular
		private Map<String, String> animations;
		@Singular
		private List<String> renderControllers;
		@Singular
		private Map<String, String> soundEffects;
		@Singular
		private Map<String, String> particleEmitters;
		@Singular
		private Map<String, String> particleEffects;
		@Singular
		@JsonUntil("1.8.0")
		private List<Map<String, String>> animationControllers; // no need since 1.9.0, they are automatically detected by file name
	}

	@Data
	@Builder
	@Jacksonized
	public static class SpawnEgg implements PackNode {
		private String texture;
		private int textureIndex;
		private HexColor baseColor;
		private HexColor overlayColor;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Scripts implements PackNode {
		private double scale;
		@Singular("addInit")
		private List<ExpressionNode> initialize;
		@Singular("addPreAnim")
		private List<ExpressionNode> preAnimation;
		@Singular("addAnimate")
		@JsonSince("1.9.0")
		private List<ConditionalEntry> animate;
		@Singular("putVariable")
		@JsonSince("1.16.100")
		private Map<String, VariableType> variable;
	}

	public enum VariableType {
		PUBLIC,
		PRIVATE;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
