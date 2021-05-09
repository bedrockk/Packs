package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.type.ChanceInformation;
import com.bedrockk.behaviorpacks.type.CoordinateEvalOrderType;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.FeatureCoordinate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ScatterFeatureDefinition extends FeatureDefinition {
	private Map<String, DefinitionDescription> description;
	private String placesFeature;
	private Boolean projectInputToFloor;
	private ExpressionNode iterations;
	private ChanceInformation scatterChance;
	private CoordinateEvalOrderType coordinateEvalOrder;
	private FeatureCoordinate x;
	private FeatureCoordinate y;
	private FeatureCoordinate z;
}
