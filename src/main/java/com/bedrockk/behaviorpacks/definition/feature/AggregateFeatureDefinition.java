package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private List<String> features;
	private EarlyOutType earlyOut;

	public enum EarlyOutType {
		NONE,
		FIRST_FAILURE,
		FIRST_SUCCESS;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
