package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BlockSensorDefinition implements EntityComponentDefinition {
	private double sensorRadius;
	@Singular("entry")
	private List<Entry> onBreak;

	@Data
	@Builder
	@Jacksonized
	public static class Entry implements PackNode {
		@Singular("block")
		private List<String> blockList;
		private String onBlockBroken;
	}
}