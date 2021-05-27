package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FeatureCoordinate implements PackNode {
	public static final int TYPE_OBJECT = 0;
	public static final int TYPE_PLAIN = 1;

	@JsonIgnore
	@Builder.Default
	private int type = TYPE_OBJECT;

	private Pair<ExpressionNode, ExpressionNode> extent;
	private FeatureDistribution distribution;
	private Integer stepSize; // if distribution type is grid
	private Integer gridOffset; // if distribution type is grid

	@JsonCreator
	public static FeatureCoordinate fromJson(JsonNode node) {
		if (!node.isObject() && !node.isArray()) {
			var expr = new ExpressionNode(node.asText());
			return builder().extent(new Pair<>(expr, expr))
					.distribution(FeatureDistribution.UNIFORM)
					.type(TYPE_PLAIN)
					.build();
		}
		return builder().extent(PackHelper.convert(node.get("extent"), new TypeReference<>() {}))
				.distribution(PackHelper.convert(node.get("distribution"), new TypeReference<>() {}))
				.stepSize(PackHelper.convert(node.get("step_size"), new TypeReference<>() {}))
				.gridOffset(PackHelper.convert(node.get("grid_offset"), new TypeReference<>() {}))
				.build();
	}

	@JsonValue
	public JsonNode toJson() {
		if (type == TYPE_OBJECT) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set("extent", PackHelper.toJsonNode(extent));
			node.set("distribution", PackHelper.toJsonNode(distribution));

			if (stepSize != null) {
				node.set("step_size", PackHelper.toJsonNode(stepSize));
			}
			if (gridOffset != null) {
				node.set("grid_offset", PackHelper.toJsonNode(gridOffset));
			}
			return node;
		}
		return PackHelper.toJsonNode(extent.first());
	}
}
