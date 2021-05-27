package com.bedrockk.packs.definition;

import com.bedrockk.packs.description.definition.SpawnRuleDefinitionDescription;
import com.bedrockk.packs.json.MinecraftNamingStrategy;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.EmptyObject;
import com.bedrockk.packs.type.GameDifficultyType;
import com.bedrockk.packs.type.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@Data
@SuperBuilder
@Jacksonized
public class SpawnRuleDefinition extends VersionedDefinition {
	private SpawnRuleDefinitionDescription description;
	@Singular
	private List<Conditions> conditions;

	@Data
	@SuperBuilder
	@Jacksonized
	@JsonNaming(MinecraftNamingStrategy.class)
	public static class Conditions implements PackNode {
		private EmptyObject spawnsOnSurface;
		private EmptyObject spawnsUnderground;
		private EmptyObject spawnsUnderwater;
		@Singular("spawnsOnBlock")
		private List<String> spawnsOnBlockFilter;
		@Singular("spawnsOnBlockPrevented")
		private List<String> spawnsOnBlockPreventedFilter;
		private BrightnessFilter brightnessFilter;
		private DifficultyFilter difficultyFilter;
		private Weight weight;
		private Herd herd;
		private DensityLimit densityLimit;
		private BiomeFilterDefinition biomeFilter;
		private PlayerInVillageFilter playerInVillageFilter;
		private DelayFilter delayFilter;
		private Range distanceFilter;
		private Range heightFilter;
		private Range worldAgeFilter;
		@Singular("permuteEntry")
		private List<PermuteEntry> permuteType;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class BrightnessFilter implements PackNode {
		private double min;
		private double max;
		private boolean adjustForWeather;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class DifficultyFilter implements PackNode {
		private GameDifficultyType min;
		private GameDifficultyType max;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Weight implements PackNode {
		@JsonProperty("default")
		private double defaultValue;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Herd implements PackNode {
		private double minSize;
		private double maxSize;
		private int eventSkipCount;
		private String event;
		private int initialEventCount;
		private String initialEvent;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class DensityLimit implements PackNode {
		private double surface;
		private double underground;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class PlayerInVillageFilter implements PackNode {
		private double distance;
		private double villageBorderTolerance;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class DelayFilter implements PackNode {
		private double min;
		private double max;
		private String identifier;
		private double spawnChance;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class PermuteEntry implements PackNode {
		private int weight;
		private String entityType;
	}

	public enum PopulationControlType {
		ANIMAL,
		MONSTER,
		PILLAGER,
		WATER_ANIMAL;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
