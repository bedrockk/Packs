package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class FeatureCoordinate implements PackNode {
	private Pair<ExpressionNode, ExpressionNode> extent;
	private FeatureDistribution distribution;
	private Integer stepSize;
	private Integer gridOffset;

	@JsonCreator
	public static FeatureCoordinate fromJson(JsonNode node) {
		var coord = new FeatureCoordinate();
		if (!node.isObject() && !node.isArray()) {
			coord.extent = new Pair<>(new ExpressionNode(0), new ExpressionNode(node.asText()));
			coord.distribution = FeatureDistribution.GAUSSIAN;
		} else {
			if (node.has("extent")) {
				coord.extent = PackHelper.MAPPER.convertValue(node.get("extent"), new TypeReference<>() {});
			}
			if (node.has("distribution")) {
				coord.distribution = PackHelper.MAPPER.convertValue(node.get("distribution"), new TypeReference<>() {});
			}
			if (node.has("step_size")) {
				coord.stepSize = PackHelper.MAPPER.convertValue(node.get("step_size"), new TypeReference<>() {});
			}
			if (node.has("grid_offset")) {
				coord.gridOffset = PackHelper.MAPPER.convertValue(node.get("grid_offset"), new TypeReference<>() {});
			}
		}
		return coord;
	}
}
