package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.bedrockk.behaviorpacks.type.BlockStateMap;

import java.util.HashMap;

public class CategoryDescription extends SingleValueNode<String> implements DefinitionDescription {
	public CategoryDescription(String value) {
		super(value);
	}
}
