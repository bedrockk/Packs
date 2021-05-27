package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class SearchFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String placesFeature;
	private SearchVolume searchVolume;
	private SearchAxis searchAxis;
	private Integer requiredSuccesses;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
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
