package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonSince("1.16.220")
@SuperBuilder
@Jacksonized
public class UnderwaterCaveCarverFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference fillWith;
	private ExpressionNode widthModifier;
	private BlockReference replaceAirWith;
}
