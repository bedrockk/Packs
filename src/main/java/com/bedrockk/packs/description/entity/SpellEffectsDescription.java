package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.description.EntityDescription;
import com.bedrockk.packs.type.EffectType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SpellEffectsDescription implements EntityDescription {
	@Singular
	private List<Effect> addEffects;
	@Singular
	private List<String> removeEffects;

	@Data
	@Builder
	@Jacksonized
	public static class Effect {
		private EffectType effect;
		private int duration;
		private int amplifier;
		private boolean visible;
		private boolean ambient;
		private boolean displayOnScreenAnimation;
	}
}
