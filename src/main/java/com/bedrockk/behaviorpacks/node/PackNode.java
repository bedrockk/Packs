package com.bedrockk.behaviorpacks.node;

import java.util.Optional;

public interface PackNode {
	default <T> Optional<T> opt(T get) {
		return Optional.ofNullable(get);
	}
}
