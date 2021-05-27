package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class TransformationDefinition implements EntityComponentDefinition {

	@Singular("addTo")
	private List<EntityType> add;
	private String beginTransformSound;
	@Singular("addDelay")
	private List<EntityType> delay;
	private boolean dropEquipment;
	private boolean dropInventory;
	private String into;
	private boolean keepLevel;
	private boolean keepOwner;
	private boolean preserveEquipment;
	private String transformationSound;
}