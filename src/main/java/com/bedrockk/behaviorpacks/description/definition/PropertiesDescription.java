package com.bedrockk.behaviorpacks.description.definition;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.bedrockk.behaviorpacks.type.BlockStateMap;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

@JsonSince("1.16.100")
public class PropertiesDescription extends HashMap<String, BlockStateMap> implements DefinitionDescription {

}
