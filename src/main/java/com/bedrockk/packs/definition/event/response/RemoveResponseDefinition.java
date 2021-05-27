package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.type.EffectType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RemoveResponseDefinition implements EventResponseDefinition {
	@Singular
	private List<String> componentGroups;
	@Singular
	private List<EffectType> spellEffects;
}