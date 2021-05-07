package com.bedrockk.behaviorpacks.definition.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InventoryDefinition implements EntityComponentDefinition{
	
	private int additionalSlotsPerStrength = 0;
	private boolean canBeSiphonedFrom = false;
	private String containerType = "none";
	private int inventorySize = 5;
	@JsonProperty("private")
	private Boolean isPrivate = false;
	private boolean restrictToOwner = false;
}