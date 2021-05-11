package com.bedrockk.packs.definition.entity;

import lombok.Data;

import java.util.Locale;

@Data
public class DwellerDefinition implements EntityComponentDefinition {
	private String dwellerType = "village";
	private Role dwellerRole;
	private int updateIntervalBase;
	private int updateIntervalVariant;
	private boolean canFindPoi;
	private boolean canMigrate;
	private double firstFoundingReward;
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
