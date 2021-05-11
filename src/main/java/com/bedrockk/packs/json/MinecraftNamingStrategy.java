package com.bedrockk.packs.json;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;

public class MinecraftNamingStrategy extends PropertyNamingStrategies.SnakeCaseStrategy {

	@Override
	public String translate(String input) {
		String name = super.translate(input);
		if (!name.startsWith("minecraft:")) {
			return "minecraft:" + name;
		}
		return name;
	}
}
