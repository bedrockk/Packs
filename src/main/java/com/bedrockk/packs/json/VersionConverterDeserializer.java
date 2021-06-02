package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class VersionConverterDeserializer extends JsonDeserializer<Object> {
	private final Converter<JsonNode, JsonNode> converter;
	private final JavaType type;

	@Override
	public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		var node = p.readValueAs(JsonNode.class);
		converter.convert(node);
		return PackHelper.MAPPER.convertValue(node, type);
	}
}
