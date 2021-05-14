package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

import java.awt.*;

public class HexColor extends Color {
	@JsonCreator
	public HexColor(String hex) {
		super(Integer.decode(hex), true);
	}

	@JsonValue
	public JsonNode toJson() {
		return PackHelper.toJsonNode("#" + Integer.toHexString(getRGB()));
	}
}
