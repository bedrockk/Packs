package com.bedrockk.packs.definition;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;
import java.nio.file.Path;

@Data
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
			return new Texture(PackHelper.MAPPER.convertValue(value, Path.class), null);
		}
	}
}
