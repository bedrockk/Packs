package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({})
// TODO
public interface BlockComponentNode extends PackNode {
}
