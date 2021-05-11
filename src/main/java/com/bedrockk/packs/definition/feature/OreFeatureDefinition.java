package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
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