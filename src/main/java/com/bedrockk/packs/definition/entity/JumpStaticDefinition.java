package com.bedrockk.packs.definition.entity;

import lombok.Data;

@Data
public class JumpStaticDefinition implements EntityComponentDefinition {

	private double jumpPower = 0.42;
}