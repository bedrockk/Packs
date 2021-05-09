package com.bedrockk.behaviorpacks.definition.feature.tree;

import lombok.Data;

@Data
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