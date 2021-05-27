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
public class BlockEventResponseBundleDefinition implements Definition {
	private AddMobEffectResponseDefinition addMobEffect;
	private DamageResponseDefinition damage;
	private DecrementStackResponseDefinition decrementStack;
	private DieResponseDefinition die;
	private PlayEffectResponseDefinition playEffect;
	private PlaySoundResponseDefinition playSound;
	private RemoveMobEffectResponseDefinition removeMobEffect;
	@JsonAlias("execute")
	private RunCommandResponseDefinition runCommand;
	private TeleportResponseDefinition teleport;
	private TransformItemResponseDefinition transformItem;
	private TriggerResponseDefinition trigger;
	private SetBlockAtPosResponseDefinition setBlockAtPos;
	private SetBlockPropertyResponseDefinition setBlockProperty;
	private SetBlockResponseDefinition setBlock;

	@Singular("randomized")
	private List<RandomizeEntry<BlockEventResponseBundleDefinition>> randomize;
	@Singular("sequenced")
	private List<ConditionalSequenceEntry<BlockEventResponseBundleDefinition>> sequence;
}
