package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.SingleValueNode;

public class CategoryDescription extends SingleValueNode<String> implements DefinitionDescription {
	public CategoryDescription(String value) {
		super(value);
	}
}
