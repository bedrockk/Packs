package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.EntityFilterDefinition;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ItemSelector;
import lombok.Data;

import java.util.List;

@Data
public class BreedableDefinition implements EntityComponentDefinition{
	private List<ItemSelector> breedItems;
	private boolean allowSitting = false;
	private boolean blendAttributes = true;
	private double breedCooldown = 60.0;
	private boolean causesPregnancy = false;
	private double extraBabyChance = 0.0;
	private boolean inheritTamed = true;
	private List<EntityFilterDefinition> loveFilters;
	private boolean requireFullHealth = false;
	private boolean requireTame = true;
	private @JsonSince("1.16.220") String transformToItem;
	private BreedsWith breedsWith;
	private List<EnvRequirement> environmentRequirements;
	private MutationFactor mutationFactor;
	private DenyParentsVariant denyParentsVariant;

	@Data
	public static class BreedsWith implements PackNode {
		private String mateType;
		private String babyType;
		private EntityEventTriggerDefinition breedEvent;
	}

	@Data
	public static class EnvRequirement implements PackNode {
		private List<String> blocks;
		private int count;
		private double radius;
	}

	@Data
	public static class MutationFactor implements PackNode {
		private double color;
		private double extraVariant;
		private double variant;
	}

	@Data
	public static class DenyParentsVariant implements PackNode {
		private double chance;
		private int minVariant;
		private int maxVariant;
	}
}