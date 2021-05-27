package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.MinecraftBeta;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;

@Data
@MinecraftBeta
@JsonSince("1.17.0")
@SuperBuilder
@Jacksonized
public class ConditionalListFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	@Singular
	private List<Entry> conditionalFeatures;
	@Builder.Default
	private EarlyOutSchemeType earlyOutScheme = EarlyOutSchemeType.PLACEMENT_SUCCESS;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
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
