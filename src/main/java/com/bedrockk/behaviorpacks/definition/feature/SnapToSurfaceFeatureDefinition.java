package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SnapToSurfaceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String featureToSnap;
	private int verticalSearchRange;
	private BlockReference surface;
}
