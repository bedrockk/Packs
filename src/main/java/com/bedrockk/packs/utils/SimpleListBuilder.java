package com.bedrockk.packs.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleListBuilder<E> {
	private final List<E> list = new ArrayList<>();

	public static <T> SimpleListBuilder<T> of() {
		return new SimpleListBuilder<>();
	}

	public SimpleListBuilder<E> add(E value) {
		list.add(value);
		return this;
	}

	public SimpleListBuilder<E> add(int index, E value) {
		list.add(index, value);
		return this;
	}

	public SimpleListBuilder<E> addAll(Collection<E> other) {
		list.addAll(other);
		return this;
	}

	public List<E> build() {
		return list;
	}
}
