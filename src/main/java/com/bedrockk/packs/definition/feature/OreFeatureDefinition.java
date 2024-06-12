package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.json.VersionConverter;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@JsonSince("1.16.220")
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@JsonConverter(current = OreFeatureDefinition.Converter.class)
@Jacksonized
public class OreFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private int count;
	@Singular
	private List<ReplaceRule> replaceRules;

	@Data
	@Builder
	@Jacksonized
	public static class ReplaceRule implements PackNode {
		private BlockReference placesBlock;
		@Singular("canReplace")
		private List<BlockReference> mayReplace;
	}

	public static class Converter implements VersionConverter {

		@Override
		public JsonNode toCurrent(JsonNode value, SemVersion version) {
			if (version.isLower(FormatVersions.V1_16_220) && value instanceof ObjectNode node && value.has("may_replace")) {
				var array = PackHelper.MAPPER.createArrayNode();
				var rule = PackHelper.MAPPER.createObjectNode();
				rule.set("places_block", node.remove("places_block"));
				rule.set("may_replace", node.remove("may_replace"));
				array.add(rule);

				node.set("replace_rules", array);
			}
			return value;
		}
	}
}
