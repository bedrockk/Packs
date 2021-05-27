package com.bedrockk.packs.definition.event;

import com.bedrockk.packs.definition.Definition;
import com.bedrockk.packs.definition.event.response.*;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class EntityEventResponseBundleDefinition implements Definition {
	private AddMobEffectResponseDefinition addMobEffect;
	private AddResponseDefinition add;
	private DamageResponseDefinition damage;
	private DecrementStackResponseDefinition decrementStack;
	private DieResponseDefinition die;
	private PlayEffectResponseDefinition playEffect;
	private PlaySoundResponseDefinition playSound;
	private RemoveMobEffectResponseDefinition removeMobEffect;
	private RemoveResponseDefinition remove;
	@JsonAlias("execute")
	private RunCommandResponseDefinition runCommand;
	private TeleportResponseDefinition teleport;
	private TransformItemResponseDefinition transformItem;
	private TriggerResponseDefinition trigger;

	@Singular("randomized")
	private List<RandomizeEntry<EntityEventResponseBundleDefinition>> randomize;
	@Singular("sequenced")
	private List<SequenceEntry<EntityEventResponseBundleDefinition>> sequence;
}
