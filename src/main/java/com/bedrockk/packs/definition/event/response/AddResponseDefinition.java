package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.description.entity.SpellEffectsDescription;
import com.bedrockk.packs.node.EntityComponentNode;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

@Data
@Builder
@Jacksonized
public class AddResponseDefinition implements EventResponseDefinition {
	@Singular
	private List<String> componentGroups;
	@Singular
	private List<SpellEffectsDescription.Effect> spellEffects;
	private Group group;

	@Data
	@Builder
	@Jacksonized
	public static class Group implements PackNode {
		private String name;
		@Singular
		private Map<String, EntityComponentNode> components;
	}
}