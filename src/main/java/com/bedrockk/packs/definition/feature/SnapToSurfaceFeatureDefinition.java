package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonSince("1.16.220")
@SuperBuilder
@Jacksonized
public class SnapToSurfaceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String featureToSnap;
	private int verticalSearchRange;
	private BlockReference surface;
}
