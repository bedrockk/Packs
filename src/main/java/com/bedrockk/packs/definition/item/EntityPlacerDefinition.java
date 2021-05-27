package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.utils.FormatVersions;
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

	public static class Converter extends VersionedConverter<ObjectNode> {
		@Override
		public ObjectNode convert(ObjectNode value) {
			if (getVersion().isLower(FormatVersions.V1_16_100) && value.has("allowedBlocks")) {
				value.set("useOn", value.remove("allowedBlocks"));
			}
			return value;
		}
	}
}
