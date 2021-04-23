package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.entity.EntityEventDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import lombok.Data;

import java.util.Map;

@Data
public class EntityDefinition extends VersionedDefinition {
    private Map<String, DefinitionDescription> description;
    private Map<String, Map<String, EntityComponentNode>> componentGroups;
    private Map<String, EntityComponentNode> components;
    private Map<String, EntityEventDefinition> events;
}
