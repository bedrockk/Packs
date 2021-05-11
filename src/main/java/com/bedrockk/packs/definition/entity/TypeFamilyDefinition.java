package com.bedrockk.packs.definition.entity;

import lombok.Data;

import java.util.List;

@Data
public class TypeFamilyDefinition implements EntityComponentDefinition {
	private List<String> family;
}