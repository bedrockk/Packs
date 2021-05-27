package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import com.bedrockk.packs.type.BlockStateMap;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class SetBlockPropertyResponseDefinition implements EventResponseDefinition {
	private BlockStateMap stateMap;

	@JsonCreator
	public static SetBlockPropertyResponseDefinition of(Map<String, JsonNode> node) {
		return of(BlockStateMap.fromJson(node));
	}

	@JsonValue
	public JsonNode toJson() {
		return stateMap.toJson();
	}
}
