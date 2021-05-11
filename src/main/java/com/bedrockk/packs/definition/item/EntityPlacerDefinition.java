package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
@JsonSince("1.16.100")
@JsonDeserialize(converter = EntityPlacerDefinition.Converter.class)
public class EntityPlacerDefinition implements ItemComponentNode {
	private String entity;
	private List<String> useOn;
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
