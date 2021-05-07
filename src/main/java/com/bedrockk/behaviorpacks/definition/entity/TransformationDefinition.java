package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class TransformationDefinition implements EntityComponentDefinition{
	
	private List<EntityType> add;
	private String beginTransformSound;
	private List<EntityType> delay;
	private boolean dropEquipment = false;
	private boolean dropInventory = false;
	private String into;
	private boolean keepLevel = false;
	private boolean keepOwner = false;
	private boolean preserveEquipment = false;
	private String transformationSound;
}