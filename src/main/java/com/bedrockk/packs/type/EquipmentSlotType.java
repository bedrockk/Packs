package com.bedrockk.packs.type;

import java.util.Locale;

public enum EquipmentSlotType {
	ANY,
	ARMOR,
	FEET,
	HAND,
	HEAD,
	LEG,
	TORSO;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
