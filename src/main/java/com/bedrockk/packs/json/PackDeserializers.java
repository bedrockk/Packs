package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

public class PackDeserializers extends Deserializers.Base {

	@Override
	public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException {
		var intro = (PackAnnotationIntrospector) config.getAnnotationIntrospector();
		var since = intro.findJsonSince(beanDesc.getClassInfo());
		var until = intro.findJsonUntil(beanDesc.getClassInfo());
		var converter = intro.findJsonConverter(beanDesc.getClassInfo());
		var current = PackHelper.CURRENT_DEFINITION_VERSION;
		var attr = PackHelper.MAPPER.getDeserializationConfig().getAttributes().getAttribute("no-converter");

		if (converter != null && attr != null && !((boolean) attr)) {
			var conv = ClassUtil.createInstance(converter.current(), true);
			return new VersionConverterDeserializer(conv, type);
		}

		if (current != null) {
			if (current.isLower(since)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is deprecated for this definition");
			} else if (current.isHigher(until)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is not supported for this definition");
			}
		}

		return null;
	}
}
