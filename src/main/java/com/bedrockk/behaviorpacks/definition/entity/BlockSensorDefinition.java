package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class BlockSensorDefinition implements EntityComponentDefinition{
	private double sensorRadius;
	private List<Entry> onBreak;

	@Data
	public static class Entry implements PackNode {
	    private List<String> blockList;
	    private String onBlockBroken;
    }
}