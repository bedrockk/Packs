package com.bedrockk.behaviorpacks.json;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;

import java.io.IOException;

public class NamedTypeSerializer extends AsPropertyTypeSerializer {

	public NamedTypeSerializer(TypeIdResolver idRes, BeanProperty property, String propName) {
		super(idRes, property, propName);
	}

	@Override
	public JsonTypeInfo.As getTypeInclusion() {
		return JsonTypeInfo.As.EXISTING_PROPERTY;
	}

	@Override
	public NamedTypeSerializer forProperty(BeanProperty prop) {
		return (prop == _property) ? this : new NamedTypeSerializer(this._idResolver, prop, this._typePropertyName);
	}

	@Override
	public WritableTypeId writeTypePrefix(JsonGenerator g, WritableTypeId idMetadata) throws IOException {
		_generateTypeId(idMetadata);

		final JsonToken valueShape = idMetadata.valueShape;
		if (valueShape == JsonToken.START_OBJECT) {
			g.writeStartObject(idMetadata.forValue);
		} else if (valueShape == JsonToken.START_ARRAY) {
			g.writeStartArray();
		}

		return idMetadata;
	}

	@Override
	public WritableTypeId writeTypeSuffix(JsonGenerator g, WritableTypeId idMetadata) throws IOException {
		final JsonToken valueShape = idMetadata.valueShape;

		if (valueShape == JsonToken.START_OBJECT) {
			g.writeEndObject();
		} else if (valueShape == JsonToken.START_ARRAY) {
			g.writeEndArray();
		}

		return idMetadata;
	}
}
