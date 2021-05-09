package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import lombok.Data;

import java.util.List;

@Data
public class AnimationScriptsDescription implements DefinitionDescription {
	private List<String> animate;
}
