package com.bedrockk.packs.definition.feature;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.definition.FeatureDefinition;
import com.bedrockk.packs.description.definition.SimpleDefinitionDescription;
import com.bedrockk.packs.json.VersionedConverter;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.BlockReference;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@JsonSince("1.16.220")
@EqualsAndHashCode(callSuper = true)
@JsonDeserialize(converter = OreFeatureDefinition.Converter.class)
public class OreFeatureDefinition extends FeatureDefinition {
	private SimpleDefinitionDescription description;
	private int count;
	private List<ReplaceRule> replaceRules;

	@Data
	public static class ReplaceRule implements PackNode {
		private BlockReference placesBlock;
		private List<BlockReference> mayReplace;
	}

	public static class Converter extends VersionedConverter<ObjectNode> {
		@Override
		public ObjectNode convert(ObjectNode value) {
			if (getVersion().isLower(FormatVersions.V1_16_220) && value.has("may_replace")) {
				var array = PackHelper.MAPPER.createArrayNode();
				var rule = PackHelper.MAPPER.createObjectNode();
				rule.set("places_block", value.remove("places_block"));
				rule.set("may_replace", value.remove("may_replace"));
				array.add(rule);

				value.set("replace_rules", array);
			}
			return value;
		}
	}
}
