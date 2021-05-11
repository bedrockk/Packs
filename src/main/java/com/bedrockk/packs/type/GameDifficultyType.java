package com.bedrockk.packs.type;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Locale;

public enum GameDifficultyType {
	@JsonAlias("p") PEACEFUL,
	@JsonAlias("e") EASY,
	@JsonAlias("n") NORMAL,
	@JsonAlias("h") HARD;

	@Override
	public String toString() {
		return name().toLowerCase(Locale.ENGLISH);
	}
}
