package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.item.ItemEventResponseDefinition;
import com.bedrockk.packs.description.definition.ItemDefinitionDescription;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemDefinition extends VersionedDefinition {
	private ItemDefinitionDescription description;
	private Map<String, ItemComponentNode> components;
	private Map<String, ItemEventResponseDefinition> events;
}
