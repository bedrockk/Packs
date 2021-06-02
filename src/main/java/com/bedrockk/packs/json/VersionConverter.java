package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.StdConverter;

public abstract class VersionConverter<T> extends StdConverter<JsonNode, JsonNode> {

	public boolean isValid(SemVersion version) {
		return true;
	}

	@Override
	public JsonNode convert(JsonNode value) {
		return isValid(PackHelper.CURRENT_DEFINITION_VERSION) ? apply(value) : value;
	}

	public abstract JsonNode apply(JsonNode node);
}
