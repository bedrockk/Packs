package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
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
