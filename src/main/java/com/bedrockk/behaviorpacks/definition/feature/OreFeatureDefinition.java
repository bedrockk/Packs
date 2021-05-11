package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.type.BlockReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class OreFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private int count;
	private BlockReference placesBlock;
	private List<BlockReference> mayReplace;
}
