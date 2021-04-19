package com.bedrockk.behaviorpacks.json;

import com.bedrockk.behaviorpacks.definition.VersionedDefinition;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import java.io.IOException;
import java.util.*;

public class DefinitionTypeDeserializer extends AsPropertyTypeDeserializer {
    private static final long serialVersionUID = 1L;

    public DefinitionTypeDeserializer(JavaType bt, TypeIdResolver idRes, JavaType defaultImpl, DeserializationConfig config, Collection<NamedType> subtypes) {
        super(bt, idRes, null, false, defaultImpl);
    }

    public DefinitionTypeDeserializer(DefinitionTypeDeserializer src, BeanProperty property) {
        super(src, property);
    }

    @Override
    public JsonTypeInfo.As getTypeInclusion() {
        return null;
    }

    @Override
    public TypeDeserializer forProperty(BeanProperty prop) {
        return (prop == _property) ? this : new DefinitionTypeDeserializer(this, prop);
    }

    @Override
    public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
        String formatVersion = null;
        Object definition = null;

        JsonToken t = p.currentToken();
        if (t == JsonToken.START_OBJECT) {
            t = p.nextToken();
            for (; t == JsonToken.FIELD_NAME; t = p.nextToken()) {
                String name = p.currentName();
                p.nextToken();

                if (name.equals("format_version")) {
                    formatVersion = p.getValueAsString();
                } else {
                    @SuppressWarnings("resource")
                    TokenBuffer tb = new TokenBuffer(p, ctxt);
                    tb.copyCurrentStructure(p);

                    definition = _deserializeTypedForId(p, ctxt, tb, name);
                }
            }
        } else {
            throw new InvalidTypeIdException(p, "Could not found root object for definition", _baseType, "NAMED");
        }

        if (formatVersion != null && definition instanceof VersionedDefinition) {
            ((VersionedDefinition) definition).setFormatVersion(SemVersion.of(formatVersion));
        }

        return definition;
    }
}
