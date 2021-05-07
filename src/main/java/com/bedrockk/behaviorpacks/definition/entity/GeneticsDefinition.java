package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class GeneticsDefinition implements EntityComponentDefinition{
	private List<Gene> genes;
	private double mutationRate = 0.03125;

	@Data
	public static class Gene implements PackNode {
		private String name;
		private int alleleRange;
		private List<GeneticVariant> geneticVariants;
	}

	@Data
	public static class GeneticVariant implements PackNode {
		private int mainAllele;
		private int bothAllele;
		private int hiddenAllele;
		private int eitherAllele;
		private EntityEventTriggerDefinition birthEvent;
	}
}