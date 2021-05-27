package com.bedrockk.packs.utils;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBuilder<K, V> {
	private final Map<K, V> map = new HashMap<>();

	public static <A, B> SimpleMapBuilder<A, B> of() {
		return new SimpleMapBuilder<>();
	}

	public SimpleMapBuilder<K, V> put(K key, V value) {
		map.put(key, value);
		return this;
	}

	public SimpleMapBuilder<K, V> putIfAbsent(K key, V value) {
		map.putIfAbsent(key, value);
		return this;
	}

	public SimpleMapBuilder<K, V> putAll(Map<K, V> other) {
		map.putAll(other);
		return this;
	}

	public Map<K, V> build() {
		return map;
	}
}
