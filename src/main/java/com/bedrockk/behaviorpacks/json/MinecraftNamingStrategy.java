package com.bedrockk.behaviorpacks.json;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

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
