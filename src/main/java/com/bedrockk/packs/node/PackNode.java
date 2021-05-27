package com.bedrockk.packs.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public interface PackNode {
	default <T> Optional<T> opt(T get) {
		return Optional.ofNullable(get);
	}

	default <T> List<T> list(Supplier<List<T>> supplier) {
		return supplier.get() == null ? new ArrayList<>() : supplier.get();
	}
}
