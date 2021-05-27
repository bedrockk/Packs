package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Locale;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class ArmorDefinition implements ItemComponentNode {
	private int protection;
	private ArmorType textureType;

	public enum ArmorType {
		LEATHER,
		CHAIN,
		DIAMOND,
		IRON,
		GOLD;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
