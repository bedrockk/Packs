package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@MinecraftBeta
@JsonSince("1.17.0")
@SuperBuilder
@Jacksonized
public class MultiFaceFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private BlockReference placesBlock;
	private int searchRange;
	private boolean canPlaceOnFloor;
	private boolean canPlaceOnCeiling;
	private boolean canPlaceOnWall;
	private int chanceOfSpreading;
	@Singular("placeOn")
	private List<BlockReference> canPlaceOn;
}
