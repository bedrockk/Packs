package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.event.EntityEventResponseBundleDefinition;
import com.bedrockk.packs.description.definition.EntityDefinitionDescription;
import com.bedrockk.packs.node.EntityComponentNode;
import com.bedrockk.packs.type.EmptyObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Jacksonized
public class EntityDefinition extends VersionedDefinition {
	private EntityDefinitionDescription description;
	@Singular
	private Map<String, Map<String, EntityComponentNode>> componentGroups;
	@Singular
	private Map<String, EntityComponentNode> components;
	@Singular
	private Map<String, EntityEventResponseBundleDefinition> events;
	private EmptyObject doNotUpgrade;
}
