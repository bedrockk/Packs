package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.ExpressionNode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
public class ConditionalListFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<Entry> conditionalFeatures;
	private EarlyOutSchemeType earlyOutScheme = EarlyOutSchemeType.PLACEMENT_SUCCESS;

	@Data
	public static class Entry implements PackNode {
		private String placesFeature;
		private ExpressionNode condition;
	}

	public enum EarlyOutSchemeType {
		PLACEMENT_FAILURE,
		PLACEMENT_SUCCESS;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
