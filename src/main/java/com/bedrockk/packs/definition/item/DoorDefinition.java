package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class DoorDefinition implements ItemComponentNode {
	private MaterialType material;
	private DoorType type;

	public enum MaterialType {
		WOOD,
		METAL;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum DoorType {
		ACACIA,
		BIRCH,
		DARK_OAK,
		IRON,
		JUNGLE,
		SPRUCE,
		OAK;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
