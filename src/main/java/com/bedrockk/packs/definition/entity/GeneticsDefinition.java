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
public class GeneticsDefinition implements EntityComponentDefinition {
	@Singular
	private List<Gene> genes;
	@Builder.Default
	private double mutationRate = 0.03125;

	@Data
	@Builder
	@Jacksonized
	public static class Gene implements PackNode {
		private String name;
		private int alleleRange;
		@Singular
		private List<GeneticVariant> geneticVariants;
	}

	@Data
	@Builder
	@Jacksonized
	public static class GeneticVariant implements PackNode {
		private int mainAllele;
		private int bothAllele;
		private int hiddenAllele;
		private int eitherAllele;
		private EntityEventTriggerDefinition birthEvent;
	}
}