package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.*;
import lombok.Data;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
public class ClientEntityDefinition extends VersionedDefinition {
	private Description description;

	@Data
	public static class Description implements PackNode {
		private String identifier;
		private SemVersion minEngineVersion;
		private boolean enableAttachables;
		private SpawnEgg spawnEgg;
		private Map<String, EntityMaterialType> materials;
		private Map<String, Path> textures;
		private Map<String, String> geometry;
		private Map<String, String> animations;
		private List<String> renderControllers;
		private Map<String, String> soundEffects;
		private Map<String, String> particleEmitters;
		private Map<String, String> particleEffects;
		private @JsonUntil("1.8.0") List<Map<String, String>> animationControllers; // no need since 1.9.0, they are automatically detected by file name
	}

	@Data
	public static class SpawnEgg implements PackNode {
		private String texture;
		private int textureIndex;
		private ColorReference baseColor;
		private ColorReference overlayColor;
	}

	@Data
	public static class Scripts implements PackNode {
		private double scale;
		private List<ExpressionNode> initialize;
		private List<ExpressionNode> preAnimation;
		private @JsonSince("1.9.0") List<ConditionalEntry> animate;
		private @JsonSince("1.16.100") Map<String, VariableType> variable;
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
