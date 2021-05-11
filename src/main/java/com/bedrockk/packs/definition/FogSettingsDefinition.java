package com.bedrockk.packs.definition;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import lombok.Data;

import java.util.Locale;
import java.util.Map;

@Data
@JsonSince("1.16.100")
public class FogSettingsDefinition extends VersionedDefinition {
	private SimpleDefinitionDescription description;
	private Map<DistanceType, Distance> distance;
	private Volumetric volumetric;

	@Data
	public static class Distance {
		private double fogStart;
		private double fogEnd;
		private String fogColor;
		private RenderDistanceType renderDistanceType;
	}

	@Data
	public static class Volumetric {
		private Map<DensityType, Density> density;
		private Map<CoefficientType, Coefficient> mediaCoefficients;
	}

	@Data
	public static class Density {
		private double maxDensity;
		private Double maxDensityHeight;
		private Double zeroDensityHeight;
		private Boolean uniform;
	}

	@Data
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
