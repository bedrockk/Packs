package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
@JsonSince("1.16.100")
public class EnchantableDefinition implements ItemComponentNode {
	private EnchantSlot slot;
	private int value;

	public enum EnchantSlot {
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
}
