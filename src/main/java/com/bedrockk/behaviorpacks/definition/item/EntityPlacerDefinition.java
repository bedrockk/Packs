package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.json.VersionedConverter;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.ArrayList;
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
