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
public class InteractDefinition implements EntityComponentDefinition {
	private Interactions interactions;

	@Data
	@Builder
	@Jacksonized
	public static class Interactions implements PackNode {
		private LootDefinition addItems;
		private double cooldown;
		private int hurtItem;
		private String interactText;
		private EntityEventTriggerDefinition onInteract;
		private ParticleReference particleOnStart;
		private String playSounds;
		@Singular
		private List<String> spawnEntities;
		private LootDefinition spawnItems;
		private boolean swing;
		private String transformToItem;
		private boolean useItem;
		private boolean barter;
		private boolean admire;
	}
}