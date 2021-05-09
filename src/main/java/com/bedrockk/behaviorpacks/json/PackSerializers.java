package com.bedrockk.behaviorpacks.json;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.SneakyThrows;

public class PackSerializers extends Serializers.Base {

	@Override
	@SneakyThrows
	public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
		var inst = (PackAnnotationIntrospector) config.getAnnotationIntrospector();
		var since = inst.findJsonSince(beanDesc.getClassInfo());
		var until = inst.findJsonUntil(beanDesc.getClassInfo());
		var current = PackHelper.CURRENT_DEFINITION_VERSION;

		if (current != null && inst.findSerializationConverter(beanDesc.getClassInfo()) == null) { // ignore if has converter
			if (current.isLower(since)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + since.toString() + " is deprecated for this definition");
			} else if (current.isHigher(until)) {
				throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + until.toString() + " is not supported for this definition");
			}
		}

		return null;
	}
}
