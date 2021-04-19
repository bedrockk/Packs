package com.bedrockk.behaviorpacks.description.attribute;

import com.bedrockk.behaviorpacks.description.Description;
import com.bedrockk.behaviorpacks.description.trigger.*;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.bedrockk.behaviorpacks.node.EntityComponentNode;
import com.bedrockk.behaviorpacks.utils.EntityComponentIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

public interface AttributeDescription extends Description, EntityComponentNode {
}
