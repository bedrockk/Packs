package com.bedrockk.packs.definition.event;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.definition.event.response.*;
import com.bedrockk.packs.type.EmptyObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class ItemEventResponseBundleDefinition implements Definition {
	private AddMobEffectResponseDefinition addMobEffect;
	private DamageResponseDefinition damage;
	private DecrementStackResponseDefinition decrementStack;
	private RemoveMobEffectResponseDefinition removeMobEffect;
	@JsonAlias("execute")
	private RunCommandResponseDefinition runCommand;
	private TeleportResponseDefinition teleport;
	private TransformItemResponseDefinition transformItem;
	private ShootResponseDefinition shoot;
	private EmptyObject swing;

	@Singular("randomized")
	private List<RandomizeEntry<ItemEventResponseBundleDefinition>> randomize;
	@Singular("sequenced")
	private List<ConditionalSequenceEntry<ItemEventResponseBundleDefinition>> sequence;
}
