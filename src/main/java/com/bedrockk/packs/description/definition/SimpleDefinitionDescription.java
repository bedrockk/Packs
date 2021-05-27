package com.bedrockk.packs.description.definition;

import com.bedrockk.packs.description.DefinitionDescription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SimpleDefinitionDescription implements DefinitionDescription {
	private String identifier;
}
