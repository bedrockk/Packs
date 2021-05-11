package com.bedrockk.behaviorpacks.definition.feature;

import com.bedrockk.behaviorpacks.definition.FeatureDefinition;
import com.bedrockk.behaviorpacks.description.definition.SimpleDefinitionDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.BlockReference;
import com.bedrockk.behaviorpacks.type.EmptyObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Locale;

@EqualsAndHashCode(callSuper = true)
@Data
public class StructureTemplateFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private String structureName;
	private Integer adjustmentRadius;
	private FacingDirection facingDirection;

	@Data
	public static class Constraints implements PackNode {
		private EmptyObject grounded;
		private EmptyObject unburied;
		private BlockIntersection blockIntersection;
	}

	@Data
	public static class BlockIntersection implements PackNode {
		private List<BlockReference> blockAllowList; // blockWhiteList for < 1.16.100
	}

	public enum FacingDirection {
		NORTH,
		SOUTH,
		EAST,
		WEST,
		RANDOM;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
