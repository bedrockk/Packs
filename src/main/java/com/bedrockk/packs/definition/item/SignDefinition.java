package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Locale;

@Data
@Builder
@Jacksonized
@MinecraftBeta
@JsonSince("1.17.0")
public class SignDefinition implements ItemComponentNode {
	private SignType type;

	public enum SignType {
		ACACIA,
		BIRCH,
		DARK_OAK,
		JUNGLE,
		OAK,
		SPRUCE;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
