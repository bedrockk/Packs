package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.type.Range;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class BegGoalDefinition implements EntityComponentDefinition {
	private int priority;
	@Builder.Default
	private double lookDistance = 8.0;
	private Range lookTime;
	@Singular
	private List<String> items;
}