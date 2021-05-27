package com.bedrockk.packs.definition;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.awt.*;
import java.nio.file.Path;

@Data
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class TextureSetDefinition extends VersionedDefinition {
	private Texture color;
	private Texture colorUnlit;
	private Texture normal;
	private Texture heightmap;
	private Texture metalnessEmissiveRoughness;
	private Texture metalness;
	private Texture emissive;
	private Texture roughness;

	public static record Texture(Path path, Color color) implements PackNode {
		@JsonCreator
		public static Texture of(String value) {
			if (value.startsWith("#")) {
				return new Texture(null, Color.decode(value));
			}
			return new Texture(PackHelper.convert(value, new TypeReference<>() {}), null);
		}

		@JsonValue
		public JsonNode toJson() {
			if (path != null) {
				return PackHelper.toJsonNode(path);
			}
			return PackHelper.toJsonNode(color);
		}
	}
}
