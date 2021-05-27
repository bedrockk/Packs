package com.bedrockk.packs.definition.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Locale;

@Data
@Builder
@Jacksonized
public class DwellerDefinition implements EntityComponentDefinition {
	@Builder.Default
	private String dwellerType = "village";
	private Role dwellerRole;
	private int updateIntervalBase;
	private int updateIntervalVariant;
	private boolean canFindPoi;
	private boolean canMigrate;
	private double firstFoundingReward;
	@Builder.Default
	private String preferredProfession = "weaponsmith";

	public enum Role {
		HOSTILE,
		INHABITANT,
		DEFENDER;

		@Override
		public String toString() {
			return this.name().toLowerCase(Locale.ENGLISH);
		}
	}
}
