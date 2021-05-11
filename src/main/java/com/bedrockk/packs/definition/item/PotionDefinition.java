package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
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
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
