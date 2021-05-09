package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Data
public class FoodDefinition implements ItemComponentNode {
	private int nutrition;
	private SaturationModifier saturationModifier;
	private String usingConvertsTo;
	private List<Effect> effects = new ArrayList<>();
	private String onUseAction;
	private boolean canAlwaysEat = false;

	@Data
	public static class Effect implements PackNode {
		private String name;
		private double chance;
		private int duration;
		private int amplifier;
	}

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
