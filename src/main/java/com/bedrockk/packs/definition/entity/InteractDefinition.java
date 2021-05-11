package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class InteractDefinition implements EntityComponentDefinition {
	private Interactions interactions;

	@Data
	public static class Interactions implements PackNode {
		private LootDefinition addItems;
		private double cooldown = 0.0;
		private int hurtItem = 0;
		private String interactText;
		private EntityEventTriggerDefinition onInteract;
		private ParticleReference particleOnStart;
		private String playSounds;
		private List<String> spawnEntities;
		private LootDefinition spawnItems;
		private boolean swing = false;
		private String transformToItem;
		private boolean useItem = false;
		private boolean barter;
		private boolean admire;
	}
}