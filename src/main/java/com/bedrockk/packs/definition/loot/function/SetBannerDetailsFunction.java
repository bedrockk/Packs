package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.definition.loot.LootTableFunction;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonConverter(current = SetBannerDetailsFunction.Converter.class)
public class SetBannerDetailsFunction implements LootTableFunction {
	private String type; // default or illager_captain
	private String baseColor;
	@Singular
	private List<Pattern> patterns;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Pattern implements PackNode {
		private String pattern;
		private String color;
	}

	public static class Converter extends VersionConverter<SetBannerDetailsFunction> {

		@Override
		public boolean isValid(SemVersion version) {
			return version.isLower(FormatVersions.V1_16_100);
		}

		@Override
		public JsonNode apply(JsonNode value) {
			if (value instanceof ObjectNode node && value.has("type")) {
				var type = value.get("type");
				if (type.isObject() && type.has("min") && type.has("max")) {
					node.set("type", PackHelper.toJsonNode("default"));
				}
			}
			return value;
		}
	}
}
