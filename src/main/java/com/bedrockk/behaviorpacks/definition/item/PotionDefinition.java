package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.Locale;

@Data
@JsonSince("1.16.100")
public class PotionDefinition implements ItemComponentNode {
	private PotionType type;

	public enum PotionType {
		LINGERING,
		REGULAR,
		SPLASH;

		@Override
		@JsonValue
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
