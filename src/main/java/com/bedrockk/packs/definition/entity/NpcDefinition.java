package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.0")
public class NpcDefinition implements EntityComponentDefinition {
	private NpcData npcData;

	@Data
	@Builder
	@Jacksonized
	public static class NpcData implements PackNode {
		private Offset portraitOffsets;
		private Offset pickerOffsets;
		@Singular("skin")
		private List<Skin> skinList;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Offset implements PackNode {
		private ImmutableVec3 translate;
		private ImmutableVec3 scale;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Skin implements PackNode {
		private int variant;
	}
}