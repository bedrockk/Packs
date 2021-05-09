package com.bedrockk.behaviorpacks.json;

import com.bedrockk.behaviorpacks.PackHelper;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.SneakyThrows;

public class PackDeserializers extends Deserializers.Base {

    @Override
    public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException {
        var inst = (PackAnnotationIntrospector) config.getAnnotationIntrospector();
        var since = inst.findJsonSince(beanDesc.getClassInfo());
        var until = inst.findJsonUntil(beanDesc.getClassInfo());
        var current = PackHelper.CURRENT_DEFINITION_VERSION;

        if (current != null && inst.findDeserializationConverter(beanDesc.getClassInfo()) == null) { // ignore if has converter
            if (current.isLower(since)) {
                throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is deprecated for this definition");
            } else if (current.isHigher(until)) {
                throw JsonMappingException.from(PackHelper.MAPPER.getDeserializationContext(), "The version " + current + " is not supported for this definition");
            }
        }

        return null;
    }
}
