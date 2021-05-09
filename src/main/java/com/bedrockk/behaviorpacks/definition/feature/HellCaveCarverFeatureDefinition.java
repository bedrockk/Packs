package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class HellCaveCarverFeatureDefinition extends FeatureDefinition {
	private Map<String, DefinitionDescription> description;
	private BlockReference fillWith;
	private ExpressionNode widthModifier;
}
