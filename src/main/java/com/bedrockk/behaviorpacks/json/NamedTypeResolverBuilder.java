package com.bedrockk.behaviorpacks.json;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.*;

import java.util.Collection;

public class NamedTypeResolverBuilder extends StdTypeResolverBuilder {

    @Override
    public TypeSerializer buildTypeSerializer(SerializationConfig config, JavaType baseType, Collection<NamedType> subtypes) {
        TypeIdResolver idRes = idResolver(config, baseType, subTypeValidator(config),
                subtypes, true, false);

        return new NamedTypeSerializer(idRes, null, _typeProperty);
    }

    @Override
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig config, JavaType baseType, Collection<NamedType> subtypes) {
        final PolymorphicTypeValidator subTypeValidator = verifyBaseTypeValidity(config, baseType);

        TypeIdResolver idRes = idResolver(config, baseType, subTypeValidator, subtypes, false, true);
        JavaType defaultImpl = defineDefaultImpl(config, baseType);

        return new NamedTypeDeserializer(baseType, idRes, defaultImpl, config, subtypes);
    }

    @Override
    protected TypeIdResolver idResolver(MapperConfig<?> config, JavaType baseType, PolymorphicTypeValidator subtypeValidator, Collection<NamedType> subtypes, boolean forSer, boolean forDeser) {
        return TypeNameIdResolver.construct(config, baseType, subtypes, forSer, forDeser);
    }
}
