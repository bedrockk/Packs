package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.Locale;
import java.util.Map;

@Data
@SuperBuilder
@Jacksonized
@JsonSince("1.16.100")
public class FogSettingsDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	@Singular("putDistance")
	private Map<DistanceType, Distance> distance;
	private Volumetric volumetric;

	@Data
	@Builder
	@Jacksonized
	public static class Distance {
		private double fogStart;
		private double fogEnd;
		private String fogColor;
		private RenderDistanceType renderDistanceType;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Volumetric {
		@Singular
		@JsonProperty("density")
		private Map<DensityType, Density> densities;
		@Singular
		private Map<CoefficientType, Coefficient> mediaCoefficients;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Density {
		private double maxDensity;
		private Double maxDensityHeight;
		private Double zeroDensityHeight;
		private boolean uniform;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Coefficient {
		private String scattering;
		private String absorption;
	}

	public enum DistanceType {
		WATER,
		AIR,
		WEATHER,
		LAVA,
		LAVA_RESISTANCE,
		POWDER_SNOW;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum RenderDistanceType {
		FIXED,
		RENDER;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum CoefficientType {
		AIR,
		WATER,
		CLOUD;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum DensityType {
		AIR,
		WATER,
		LAVA,
		LAVA_RESISTANCE;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
