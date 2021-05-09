package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum FeatureDistribution {
	GAUSSIAN,
	UNIFORM,
	INVERSE_GAUSSIAN,
	FIXED_GRID,
	JITTERED_GRID;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
