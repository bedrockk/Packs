package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class CustomHitTestDefinition implements EntityComponentDefinition {
	@Singular
	private List<HitBox> hitboxes;

	@Data
	@Builder
	@Jacksonized
	public static class HitBox implements PackNode {
		private double width;
		private double height;
		private ImmutableVec3 pivot;
	}
}