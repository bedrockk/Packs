package com.bedrockk.packs.definition;

import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.json.MinecraftNamingStrategy;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@SuperBuilder
@Jacksonized
public class SpawnGroupDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	@Singular
	private List<Conditions> conditions;

	@Data
	@SuperBuilder
	@Jacksonized
	@JsonNaming(MinecraftNamingStrategy.class)
	public static class Conditions extends SpawnRuleDefinition.Conditions {
		private MobEventFilter mobEventFilter;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class MobEventFilter implements PackNode {
		private String event;
	}
}
