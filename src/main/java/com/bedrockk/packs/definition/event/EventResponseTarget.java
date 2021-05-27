package com.bedrockk.packs.definition.event;

import java.util.Locale;

public enum EventResponseTarget {
	SELF, // entity, block
	OTHER, // entity, block, item
	HOLDER, // entity, item
	ITEM; // item

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}