package com.bedrockk.packs.type;

import java.util.Locale;

public enum ItemCategoryType {
	NATURE,
	CONSTRUCTION,
	ITEMS,
	EQUIPMENT,
	NONE,
	COMMANDS;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
