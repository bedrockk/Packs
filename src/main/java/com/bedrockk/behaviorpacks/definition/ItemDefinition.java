package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.item.ItemEventDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemDefinition extends VersionedDefinition {
	private Map<String, DefinitionDescription> description;
	private Map<String, ItemComponentNode> components;
	private Map<String, ItemEventDefinition> events;
}
