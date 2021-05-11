package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UnderwaterCaveCarverFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference fillWith;
	private ExpressionNode widthModifier;
	private BlockReference replaceAirWith;
}
