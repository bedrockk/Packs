package com.bedrockk.packs.utils;

import lombok.SneakyThrows;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ListBuilder<T extends Collection<E>, E> {
	private final Class<T> targetClass;
	private final List<E> list = new ArrayList<>();

	public ListBuilder(Class<T> targetClass) {
		this.targetClass = targetClass;
	}

	@SneakyThrows
	@SuppressWarnings("unchecked")
	public ListBuilder(Type type) {
		this.targetClass = (Class<T>) Class.forName(type.getTypeName());
	}

	public ListBuilder<T, E> add(E value) {
		list.add(value);
		return this;
	}

	public ListBuilder<T, E> add(int index, E value) {
		list.add(index, value);
		return this;
	}

	public ListBuilder<T, E> addAll(Collection<E> other) {
		list.addAll(other);
		return this;
	}

	@SneakyThrows
	public T build() {
		var clazz = targetClass.getDeclaredConstructor().newInstance();
		clazz.addAll(list);
		return clazz;
	}
}
