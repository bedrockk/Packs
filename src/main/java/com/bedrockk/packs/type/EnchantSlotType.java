package com.bedrockk.packs.type;

import java.util.Locale;

public enum EnchantSlotType {
	ALL,
	BOW,
	CARROT_STICK,
	ARMOR_FEET,
	ARMOR_TORSO,
	ARMOR_HEAD,
	ARMOR_LEGS,
	HOE,
	PICKAXE,
	SWORD,
	ELYTRA,
	FISHING_ROD,
	FLINTSTEEL,
	SHEARS,
	COSMETIC_HEAD;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}