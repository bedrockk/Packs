package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.json.MinecraftNamingStrategy;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
public class SpawnGroupDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	private List<Conditions> conditions;

	@Data
	@JsonNaming(MinecraftNamingStrategy.class)
	public static class Conditions extends SpawnRuleDefinition.Conditions {
		private MobEventFilter mobEventFilter;
	}

	@Data
	public static class MobEventFilter implements PackNode {
		private String event;
	}
}