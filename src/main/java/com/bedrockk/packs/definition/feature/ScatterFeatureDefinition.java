package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.ChanceInformation;
import com.bedrockk.packs.type.CoordinateEvalOrderType;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.FeatureCoordinate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class ScatterFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String placesFeature;
	private Boolean projectInputToFloor;
	private ExpressionNode iterations;
	private ChanceInformation scatterChance;
	private CoordinateEvalOrderType coordinateEvalOrder;
	private FeatureCoordinate x;
	private FeatureCoordinate y;
	private FeatureCoordinate z;
}
