package com.bedrockk.behaviorpacks.json;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.definition.VersionedDefinition;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;

import java.io.IOException;

public class DefinitionTypeSerializer extends AsExistingPropertyTypeSerializer {

    public DefinitionTypeSerializer(TypeIdResolver idRes, BeanProperty property, String propName) {
        super(idRes, property, propName);
    }

    @Override
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    @Override
    public DefinitionTypeSerializer forProperty(BeanProperty prop) {
        return (prop == _property) ? this : new DefinitionTypeSerializer(this._idResolver, prop, this._typePropertyName);
    }

    @Override
    public WritableTypeId writeTypePrefix(JsonGenerator g, WritableTypeId idMetadata) throws IOException {
        _generateTypeId(idMetadata);

        g.writeStartObject();
        if (idMetadata.forValue instanceof VersionedDefinition) {
            SemVersion version = ((VersionedDefinition) idMetadata.forValue).getFormatVersion();
            if (version == null) {
                version = PackHelper.FORMAT_VERSION;
            }
            g.writeStringField("format_version", version.toString());
        }
        g.writeFieldName(String.valueOf(idMetadata.id));
        g.writeStartObject(idMetadata.forValue);

        return idMetadata;
    }

    @Override
    public WritableTypeId writeTypeSuffix(JsonGenerator g, WritableTypeId idMetadata) throws IOException {
        g.writeEndObject();
        return idMetadata;
    }
}
