package com.bedrockk.packs.utils;

import lombok.SneakyThrows;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class MapBuilder<T extends Map<K, V>, K, V> {
	private final Class<T> targetClass;
	private final Map<K, V> map = new HashMap<>();

	public MapBuilder(Class<T> targetClass) {
		this.targetClass = targetClass;
	}

	@SneakyThrows
	@SuppressWarnings("unchecked")
	public MapBuilder(Type type) {
		this.targetClass = (Class<T>) Class.forName(type.getTypeName());
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

	@SneakyThrows
	public T build() {
		var clazz = targetClass.getDeclaredConstructor().newInstance();
		clazz.putAll(map);
		return clazz;
	}
}
