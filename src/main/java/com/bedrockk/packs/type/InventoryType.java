package com.bedrockk.packs.type;

import java.util.Locale;

public enum InventoryType {
	MINECART_CHEST,
	HORSE,
	MINECART_HOPPER,
	CONTAINER,
	INVENTORY,
	HOPPER;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
