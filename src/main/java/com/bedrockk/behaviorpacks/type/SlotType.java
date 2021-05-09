package com.bedrockk.behaviorpacks.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SlotType {
	MAINHAND("slot.weapon.mainhand"),
	OFFHAND("slot.weapon.offhand"),
	HEAD("slot.armor.head"),
	CHESTPLATE("slot.armor.chest"),
	LEGS("slot.armor.legs"),
	FEET("slot.armor.feet"),
	HOTBAR("slot.hotbar"),
	INVENTORY("slot.inventory"),
	ENDERCHEST("slot.enderchest"),
	SADDLE("slot.saddle"),
	ARMOR("slot.armor"),
	CHEST("slot.chest");

	private final String name;

	@Override
	public String toString() {
		return name;
	}
}