package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class FeatureCoordinate implements PackNode {
	public static final int TYPE_OBJECT = 0;
	public static final int TYPE_PLAIN = 1;

	private int type = TYPE_OBJECT;

	private Pair<ExpressionNode, ExpressionNode> extent;
	private FeatureDistribution distribution;
	private Integer stepSize; // if distribution type is grid
	private Integer gridOffset; // if distribution type is grid

	@JsonCreator
	public static FeatureCoordinate fromJson(JsonNode node) {
		var coord = new FeatureCoordinate();
		if (!node.isObject() && !node.isArray()) {
			var expr = new ExpressionNode(node.asText());
			coord.extent = new Pair<>(expr, expr);
			coord.distribution = FeatureDistribution.UNIFORM;
			coord.type = TYPE_PLAIN;
		} else {
			coord.extent = PackHelper.MAPPER.convertValue(node.get("extent"), new TypeReference<>() {});
			coord.distribution = PackHelper.MAPPER.convertValue(node.get("distribution"), new TypeReference<>() {});

			if (coord.distribution == FeatureDistribution.FIXED_GRID || coord.distribution == FeatureDistribution.JITTERED_GRID) {
				coord.stepSize = node.get("step_size").asInt(1);
				coord.gridOffset = node.get("grid_offset").asInt();
			}
		}
		return coord;
	}

	@JsonValue
	public JsonNode toJson() {
		if (type == TYPE_OBJECT) {
			var node = PackHelper.MAPPER.createObjectNode();
			node.set("distribution", PackHelper.toJsonNode(distribution));
			node.set("extent", PackHelper.toJsonNode(extent));

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
