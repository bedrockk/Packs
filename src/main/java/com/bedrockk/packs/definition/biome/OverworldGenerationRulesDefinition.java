package com.bedrockk.packs.definition.biome;

import com.bedrockk.packs.type.JsonList;
import com.bedrockk.packs.type.WeightedEntry;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@Data
@Builder
@Jacksonized
public class OverworldGenerationRulesDefinition implements BiomeComponentDefinition {
	private JsonList<WeightedEntry<String>> hillsTransformation;
	private JsonList<WeightedEntry<String>> mutateTransformation;
	private JsonList<WeightedEntry<String>> shoreTransformation;
	private JsonList<WeightedEntry<String>> riverTransformation;
	@Singular
	private List<WeightedEntry<Temperature>> generateForClimates;

	public enum Temperature {
		MEDIUM,
		WARM,
		LUKEWARM,
		COLD,
		FROZEN;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
