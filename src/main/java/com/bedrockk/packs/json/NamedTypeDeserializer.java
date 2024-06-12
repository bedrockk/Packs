package com.bedrockk.packs.json;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import java.io.IOException;
import java.io.Serial;
import java.util.Collection;
import java.util.Map;

public class NamedTypeDeserializer extends AsPropertyTypeDeserializer {
	@Serial
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
		var name = p.currentName();
		if (name != null) {
			JsonDeserializer<Object> deser = _findDeserializer(ctxt, name);
			return deser.deserialize(p, ctxt);
		} else {
			throw new InvalidTypeIdException(p, "Could not found root for definition", _baseType, "NAMED");
		}
	}
}
