package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

import java.awt.*;

public record ColorReference(int type, Color color) {
	public static final int TYPE_RGB = 0;
	public static final int TYPE_RGBA = 1;
	public static final int TYPE_HEX = 2;
	public static final int TYPE_INT = 3;

	@JsonCreator
	public static ColorReference of(String hex) {
		return new ColorReference(TYPE_HEX, Color.decode(hex));
	}

	@JsonCreator
	public static ColorReference of(int value) {
		return new ColorReference(TYPE_INT, new Color(value, value > 16777215));
	}

	@JsonCreator
	public static ColorReference of(@JsonProperty("r") int r, @JsonProperty("g") int g, @JsonProperty("b") int b, @JsonProperty("a") int a) {
		return new ColorReference(TYPE_RGBA, new Color(r, g, b, a));
	}

	@JsonCreator
	public static ColorReference of(@JsonProperty("r") int r, @JsonProperty("g") int g, @JsonProperty("b") int b) {
		return new ColorReference(TYPE_RGB, new Color(r, g, b));
	}

	@JsonValue
	public JsonNode toJson() {
		if (type == TYPE_RGB || type == TYPE_RGBA) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set("r", PackHelper.toJsonNode(color.getRed()));
			node.set("g", PackHelper.toJsonNode(color.getGreen()));
			node.set("b", PackHelper.toJsonNode(color.getBlue()));
			if (type == TYPE_RGBA) {
				node.set("a", PackHelper.toJsonNode(color.getAlpha()));
			}
			return node;
		} else if (type == TYPE_HEX) {
			return PackHelper.toJsonNode(String.format( "#%02X%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
		} else {
			return PackHelper.toJsonNode(color.getRGB());
		}
	}
}
