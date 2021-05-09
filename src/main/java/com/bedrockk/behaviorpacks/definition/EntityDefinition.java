package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.definition.entity.EntityEventResponseDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import com.bedrockk.behaviorpacks.type.EmptyObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class EntityDefinition extends VersionedDefinition {
    private Map<String, DefinitionDescription> description;
    private Map<String, Map<String, EntityComponentNode>> componentGroups;
    private Map<String, EntityComponentNode> components;
    private Map<String, EntityEventResponseDefinition> events;
    private EmptyObject doNotUpgrade;
}
