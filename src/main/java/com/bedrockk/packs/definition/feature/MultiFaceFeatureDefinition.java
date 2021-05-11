package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class MultiFaceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference placesBlock;
	private int searchRange;
	private boolean canPlaceOnFloor;
	private boolean canPlaceOnCeiling;
	private boolean canPlaceOnWall;
	private int chanceOfSpreading;
	private List<BlockReference> canPlaceOn;
}
