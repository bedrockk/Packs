package com.bedrockk.behaviorpacks.json;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import java.io.IOException;
import java.util.Collection;

public class NamedTypeDeserializer extends AsPropertyTypeDeserializer {
    private static final long serialVersionUID = 1L;

    public NamedTypeDeserializer(JavaType bt, TypeIdResolver idRes, JavaType defaultImpl, DeserializationConfig config, Collection<NamedType> subtypes) {
        super(bt, idRes, null, false, defaultImpl);
    }

    public NamedTypeDeserializer(NamedTypeDeserializer src, BeanProperty property) {
        super(src, property);
    }

    @Override
    public JsonTypeInfo.As getTypeInclusion() {
        return null;
    }

    @Override
    public TypeDeserializer forProperty(BeanProperty prop) {
        return (prop == _property) ? this : new NamedTypeDeserializer(this, prop);
    }

    @Override
    public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
        String name = p.currentName();
        if (name != null) {
            @SuppressWarnings("resource")
            TokenBuffer tb = new TokenBuffer(p, ctxt);
            tb.copyCurrentStructure(p);

            return _deserializeTypedForId(p, ctxt, tb, name);
        } else {
            throw new InvalidTypeIdException(p, "Could not found root for definition", _baseType, "NAMED");
        }
    }
}
