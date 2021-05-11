package com.bedrockk.packs.type;

import java.util.Locale;

public enum BlockFace {
	UP,
	DOWN,
	NORTH,
	SOUTH,
	EAST,
	WEST,
	SIDE,
	ALL;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
