package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.definition.item.DamageableDefinition;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
		@Type(name = "minecraft:damageable", value = DamageableDefinition.class)
})
// TODO
public interface ItemComponentNode extends PackNode {
}
