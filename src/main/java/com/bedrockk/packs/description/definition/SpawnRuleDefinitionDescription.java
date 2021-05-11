package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.definition.SpawnRuleDefinition;
import com.bedrockk.packs.description.DefinitionDescription;
import lombok.Data;

@Data
public class SpawnRuleDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private SpawnRuleDefinition.PopulationControlType populationControl;
}
