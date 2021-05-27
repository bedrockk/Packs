package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.SneakyThrows;

public class PackSerializers extends Serializers.Base {

	@Override
	@SneakyThrows
	public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
		var intro = (PackAnnotationIntrospector) config.getAnnotationIntrospector();
		var since = intro.findJsonSince(beanDesc.getClassInfo());
		var until = intro.findJsonUntil(beanDesc.getClassInfo());
		var current = PackHelper.CURRENT_DEFINITION_VERSION;

		if (current != null && intro.findSerializationConverter(beanDesc.getClassInfo()) == null) { // ignore if has converter
			if (current.isLower(since)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is deprecated for this definition");
			} else if (current.isHigher(until)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is not supported for this definition");
			}
		}

		return null;
	}
}
