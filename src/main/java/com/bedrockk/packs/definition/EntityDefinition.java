package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.entity.EntityEventResponseDefinition;
import com.bedrockk.packs.description.definition.EntityDefinitionDescription;
import com.bedrockk.packs.node.EntityComponentNode;
import com.bedrockk.packs.type.EmptyObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class EntityDefinition extends VersionedDefinition {
	private EntityDefinitionDescription description;
	private Map<String, Map<String, EntityComponentNode>> componentGroups;
	private Map<String, EntityComponentNode> components;
	private Map<String, EntityEventResponseDefinition> events;
	private EmptyObject doNotUpgrade;
}
