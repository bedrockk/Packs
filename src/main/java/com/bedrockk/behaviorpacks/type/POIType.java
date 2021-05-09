package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum POIType {
	BED;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
