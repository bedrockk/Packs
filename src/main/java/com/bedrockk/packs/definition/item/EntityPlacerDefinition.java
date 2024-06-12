package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
@JsonConverter(current = EntityPlacerDefinition.Converter.class)
public class EntityPlacerDefinition implements ItemComponentNode {
	private String entity;
	@Singular("canUseOn")
	private List<String> useOn;
	@Singular("canDispenseOn")
	private List<String> dispenseOn;

	public static class Converter implements VersionConverter {

		@Override
		public JsonNode toCurrent(JsonNode value, SemVersion version) {
			if (version.isLower(FormatVersions.V1_16_100) && value instanceof ObjectNode node) {
				if (node.has("allowedBlocks")) {
					node.set("useOn", node.remove("allowedBlocks"));
				}
			}
			return value;
		}
	}
}
