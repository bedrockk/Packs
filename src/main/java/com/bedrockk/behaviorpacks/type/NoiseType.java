package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum NoiseType {
	STONE_BEACH,
	DEEP_OCEAN,
	DEFAULT,
	DEFAULT_MUTATED,
	LOWLANDS,
	RIVER,
	OCEAN,
	TAIGA,
	MOUNTAINS,
	HIGHLANDS,
	MUSHROOM,
	LESS_EXTREME,
	EXTREME,
	BEACH,
	SWAMP;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
