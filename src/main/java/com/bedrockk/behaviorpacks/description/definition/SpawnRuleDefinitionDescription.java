package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.definition.SpawnRuleDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import lombok.Data;

@Data
public class SpawnRuleDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private SpawnRuleDefinition.PopulationControlType populationControl;
}
