package com.bedrockk.packs.utils;

import java.util.Collection;
import java.util.List;

public final class ListBuilder<T extends List<E>, E> {
	private final T list;

	public ListBuilder(T list) {
		this.list = list;
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

	public T build() {
		return list;
	}
}
