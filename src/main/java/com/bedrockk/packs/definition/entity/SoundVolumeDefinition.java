package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class SoundVolumeDefinition implements EntityComponentDefinition {
	private double value = 0.0;
}
