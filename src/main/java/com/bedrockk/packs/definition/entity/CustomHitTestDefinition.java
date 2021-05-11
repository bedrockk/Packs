package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Data;

import java.util.List;

@Data
public class CustomHitTestDefinition implements EntityComponentDefinition {
	private List<HitBox> hitboxes;

	@Data
	public static class HitBox implements PackNode {
		private double width;
		private double height;
		private ImmutableVec3 pivot;
	}
}