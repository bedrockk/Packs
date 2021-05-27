package com.bedrockk.packs.definition.feature.tree;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class BranchCanopy {
	private AcaciaCanopy acaciaCanopy;
	private Canopy canopy;
	private FancyCanopy fancyCanopy;
	private MegaCanopy megaCanopy;
	private MegaPineCanopy megaPineCanopy;
	private PineCanopy pineCanopy;
	private RoofedCanopy roofedCanopy;
	private SpruceCanopy spruceCanopy;
}