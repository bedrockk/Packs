package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.json.VersionedConverter;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.bedrockk.behaviorpacks.utils.FormatVersions;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(converter = BlockDestroyTimeDescription.Converter.class)
public class BlockDestroyTimeDescription extends SingleValueNode<Integer> implements BlockDescription {
    public BlockDestroyTimeDescription(Integer value) {
        super(value);
    }

    public static class Converter extends VersionedConverter<JsonNode> {
        @Override
        public JsonNode convert(JsonNode node) {
            if (node.isObject() && this.getVersion().isLower(FormatVersions.V1_16_0)) {
                return PackHelper.toJsonNode((int) node.get("value").asDouble() * 20); // convert to ticks
            }
            return node;
        }
    }
}
