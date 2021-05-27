package com.bedrockk.packs.definition;

import com.bedrockk.packs.definition.event.ItemEventResponseBundleDefinition;
import com.bedrockk.packs.description.definition.ItemDefinitionDescription;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@EqualsAndHashCode(callSuper = false)
@Data
@SuperBuilder
@Jacksonized
public class ItemDefinition extends VersionedDefinition {
	private ItemDefinitionDescription description;
	@Singular
	private Map<String, ItemComponentNode> components;
	@Singular
	private Map<String, ItemEventResponseBundleDefinition> events;
}
