package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.definition.SpawnRuleDefinition;
import com.bedrockk.packs.description.DefinitionDescription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SpawnRuleDefinitionDescription implements DefinitionDescription {
	private String identifier;
	private SpawnRuleDefinition.PopulationControlType populationControl;
}
