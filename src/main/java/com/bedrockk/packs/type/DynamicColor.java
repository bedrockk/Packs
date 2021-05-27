package com.bedrockk.packs.type;

import com.bedrockk.molang.runtime.MoLangRuntime;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;

import java.awt.*;

public record DynamicColor(ExpressionNode r, ExpressionNode g, ExpressionNode b, ExpressionNode a) {
	public static DynamicColor of(int r, int g, int b, int a) {
		return new DynamicColor(new ExpressionNode(r), new ExpressionNode(g), new ExpressionNode(b), new ExpressionNode(a));
	}

	@JsonCreator
	public static DynamicColor fromJson(JsonNode node) {
		return new DynamicColor(new ExpressionNode(node.get("r").asInt()), new ExpressionNode(node.get("g").asInt()), new ExpressionNode(node.get("b").asInt()), new ExpressionNode(node.get("a").asInt(255)));
	}

	public Color calcColor(MoLangRuntime runtime) {
		return new Color((int) r.evaluate(runtime).asDouble(), (int) g.evaluate(runtime).asDouble(), (int) b.evaluate(runtime).asDouble(), (int) a.evaluate(runtime).asDouble());
	}
}