package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HellCaveCarverFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference fillWith;
	private ExpressionNode widthModifier;
}
