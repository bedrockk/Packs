package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.0")
public class NpcDefinition implements EntityComponentDefinition {
	private NpcData npcData;

	@Data
	public static class NpcData implements PackNode {
		private Offset portraitOffsets;
		private Offset pickerOffsets;
		private List<Skin> skinList;
	}

	@Data
	public static class Offset implements PackNode {
		private ImmutableVec3 translate;
		private ImmutableVec3 scale;
	}

	@Data
	public static class Skin implements PackNode {
		private int variant;
	}
}