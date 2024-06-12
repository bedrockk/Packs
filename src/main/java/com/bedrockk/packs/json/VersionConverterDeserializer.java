package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.util.Converter;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class VersionConverterDeserializer extends JsonDeserializer<Object> {
	private final VersionConverter converter;
	private final JavaType type;

	@Override
	public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		var currentName = p.getCurrentName();
		var node = p.readValueAs(JsonNode.class);
		node = converter.toCurrent(node, PackHelper.CURRENT_DEFINITION_VERSION);

		if (currentName == null) {
			return PackHelper.MAPPER.convertValue(node, type);
		}
		var node2 = PackHelper.MAPPER.createObjectNode();
		node2.set(currentName, node);
		var parser = PackHelper.MAPPER.createParser(node.toString());
		var desc = ctxt.getConfig().introspect(type);
		PackHelper.MAPPER.setConfig(PackHelper.MAPPER.getDeserializationConfig().withAttribute("no-converter", true));
		var deser = ctxt.getFactory().createBeanDeserializer(ctxt, type, desc);
		var result = deser.deserialize(parser, ctxt);
		if (result instanceof Map<?, ?>) {
			return ((Map<?, ?>) result).get(currentName);
		}
		return null;
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
		return super.deserializeWithType(p, ctxt, typeDeserializer);
	}
}
