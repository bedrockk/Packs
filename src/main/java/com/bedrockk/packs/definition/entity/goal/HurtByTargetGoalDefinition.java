package com.bedrockk.packs.definition.entity.goal;

import com.bedrockk.packs.definition.entity.EntityComponentDefinition;
import com.bedrockk.packs.definition.entity.EntityType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class HurtByTargetGoalDefinition implements EntityComponentDefinition {
	private int priority;
	private boolean alertSameType;
	@Singular
	private List<EntityType> entityTypes;
	private boolean hurtOwner;
}