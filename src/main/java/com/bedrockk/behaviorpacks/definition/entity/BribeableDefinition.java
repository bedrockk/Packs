package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class BribeableDefinition implements EntityComponentDefinition {
	private double bribeCooldown = 2.0;
	private List<ItemSelector> bribeItems;
}