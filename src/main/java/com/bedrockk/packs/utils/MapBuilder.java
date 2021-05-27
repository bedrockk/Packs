package com.bedrockk.packs.utils;

import java.util.Map;

public final class MapBuilder<T extends Map<K, V>, K, V> {
	private final T map;

	public MapBuilder(T map) {
		this.map = map;
	}

	public MapBuilder<T, K, V> put(K key, V value) {
		map.put(key, value);
		return this;
	}

	public MapBuilder<T, K, V> putIfAbsent(K key, V value) {
		map.putIfAbsent(key, value);
		return this;
	}

	public MapBuilder<T, K, V> putAll(Map<K, V> other) {
		map.putAll(other);
		return this;
	}

	public T build() {
		return map;
	}
}
