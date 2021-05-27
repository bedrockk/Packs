package com.bedrockk.packs.definition.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class InventoryDefinition implements EntityComponentDefinition {

	private int additionalSlotsPerStrength;
	private boolean canBeSiphonedFrom;
	@Builder.Default
	private String containerType = "none";
	@Builder.Default
	private int inventorySize = 5;
	@JsonProperty("private")
	private Boolean isPrivate;
	private boolean restrictToOwner;
}