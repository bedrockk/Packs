package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class SearchFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String placesFeature;
	private SearchVolume searchVolume;
	private SearchAxis searchAxis;
	private Integer requiredSuccesses;

	@Data
	public static class SearchVolume implements PackNode {
		private ImmutableVec3 min;
		private ImmutableVec3 max;
	}

	@RequiredArgsConstructor
	public enum SearchAxis {
		MINUS_X("-x"),
		PLUS_X("+x"),
		MINUS_Y("-y"),
		PLUS_Y("+y"),
		MINUS_Z("-z"),
		PLUS_Z("+z");

		private final String value;

		@Override
		public String toString() {
			return this.value;
		}
	}
}
