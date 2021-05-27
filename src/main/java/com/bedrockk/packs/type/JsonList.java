package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.utils.ListBuilder;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;

public class JsonList<E> extends ArrayList<E> {
	private boolean minimized = false;

	public boolean isMinimized() {
		return minimized;
	}

	public void setMinimized(boolean minimized) {
		this.minimized = minimized;
	}

	public static <T> JsonList<T> ofSingle(T value) {
		var list = new JsonList<T>();
		list.add(value);
		return list;
	}

	public static <A> ListBuilder<JsonList<A>, A> builder() {
		return new ListBuilder<>((new TypeReference<JsonList<A>>() {}).getType());
	}

	@JsonCreator
	public static <T> JsonList<T> of(JsonNode node) {
		JsonList<T> list = new JsonList<>();
		if (node.isArray()) {
			for (int i = 0; i < node.size(); i++) {
				list.add(PackHelper.convert(node.get(i), new TypeReference<>() {}));
			}
		} else {
			list.add(PackHelper.convert(node, new TypeReference<>() {}));
			list.setMinimized(true);
		}
		return list;
	}

	@JsonValue
	public JsonNode toJson() {
		if (this.isMinimized() && this.size() == 1) {
			var node = PackHelper.toJsonNode(this.get(0));
			if (!node.isArray()) {
				return node;
			}
		}

		return PackHelper.toJsonNode(toArray());
	}
}
