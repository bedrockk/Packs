package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
@JsonSince("1.16.100")
public class CooldownDefinition implements ItemComponentNode {
	private Category category;
	private double duration;

	public enum Category {
		CHORUSFRUIT,
		ENDER_PEARL;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
