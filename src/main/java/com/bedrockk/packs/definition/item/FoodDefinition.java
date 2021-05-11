package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
@JsonSince("1.16.100") // TODO: implement converter
public class FoodDefinition implements ItemComponentNode {
	private ItemEventTriggerDefinition onConsume;
	private int nutrition;
	private SaturationModifier saturationModifier;
	private String usingConvertsTo;
	private boolean canAlwaysEat = false;

	public enum SaturationModifier {
		LOW,
		NORMAL,
		POOR,
		GOOD,
		SUPERNATURAL;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
