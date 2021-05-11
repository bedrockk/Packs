package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class InsomniaDefinition implements EntityComponentDefinition {

	private double daysUntilInsomnia = 3.0;
}