package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.EntityFilterDefinition;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ItemSelector;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BreedableDefinition implements EntityComponentDefinition {
	@Singular
	private List<ItemSelector> breedItems;
	private boolean allowSitting;
	@Builder.Default
	private boolean blendAttributes = true;
	@Builder.Default
	private double breedCooldown = 60.0;
	private boolean causesPregnancy;
	private double extraBabyChance;
	@Builder.Default
	private boolean inheritTamed = true;
	@Singular
	private List<EntityFilterDefinition> loveFilters;
	private boolean requireFullHealth;
	@Builder.Default
	private boolean requireTame = true;
	private @JsonSince("1.16.220")
	String transformToItem;
	private BreedsWith breedsWith;
	@Singular
	private List<EnvRequirement> environmentRequirements;
	private MutationFactor mutationFactor;
	private DenyParentsVariant denyParentsVariant;

	@Data
	@Builder
	@Jacksonized
	public static class BreedsWith implements PackNode {
		private String mateType;
		private String babyType;
		private EntityEventTriggerDefinition breedEvent;
	}

	@Data
	@Builder
	@Jacksonized
	public static class EnvRequirement implements PackNode {
		@Singular
		private List<String> blocks;
		private int count;
		private double radius;
	}

	@Data
	@Builder
	@Jacksonized
	public static class MutationFactor implements PackNode {
		private double color;
		private double extraVariant;
		private double variant;
	}

	@Data
	@Builder
	@Jacksonized
	public static class DenyParentsVariant implements PackNode {
		private double chance;
		private int minVariant;
		private int maxVariant;
	}
}