package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.definition.VersionedDefinition;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
import java.io.Serial;
import java.util.Collection;

public class DefinitionTypeDeserializer extends AsPropertyTypeDeserializer {
	@Serial
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
		SemVersion formatVersion = null;
		Object definition = null;

		JsonToken t = p.currentToken();
		if (t == JsonToken.START_OBJECT) {
			t = p.nextToken();
			for (; t == JsonToken.FIELD_NAME; t = p.nextToken()) {
				String name = p.currentName();
				p.nextToken();

				if (name.equals("format_version")) {
					formatVersion = SemVersion.of(p.getValueAsString());
				} else {
					TokenBuffer tb = new TokenBuffer(p, ctxt);
					tb.copyCurrentStructure(p);

					definition = _deserializeTypedForId(p, ctxt, tb, name);
				}
			}
		} else {
			throw new InvalidTypeIdException(p, "Could not found root object for definition: " + t, _baseType, "NAMED");
		}

		if (formatVersion != null && definition instanceof VersionedDefinition) {
			((VersionedDefinition) definition).setFormatVersion(formatVersion);
		}

		return definition;
	}
}
