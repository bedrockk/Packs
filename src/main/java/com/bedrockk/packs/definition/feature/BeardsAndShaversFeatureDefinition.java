package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@MinecraftBeta
@JsonSince("1.17.0")
@SuperBuilder
@Jacksonized
public class BeardsAndShaversFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String placesFeature;
	private ImmutableVec3 boundingBoxMin;
	private ImmutableVec3 boundingBoxMax;
	private int yDelta;
	private BlockReference surfaceBlockType;
	private BlockReference subsurfaceBlockType;
	private int beardRaggednessMin;
	private int beardRaggednessMax;
}
