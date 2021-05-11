package com.bedrockk.packs.node;

import com.fasterxml.jackson.annotation.JsonValue;

public abstract class SingleValueNode<T> {
	private final T value;

	public SingleValueNode(T value) {
		this.value = value;
	}

	@JsonValue
	public T getValue() {
		return value;
	}
}
