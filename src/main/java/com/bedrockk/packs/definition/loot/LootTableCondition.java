package com.bedrockk.packs.definition.loot;

import com.bedrockk.packs.definition.loot.condition.*;
import com.bedrockk.packs.node.PackNode;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "condition", visible = true)
@JsonSubTypes({
		@Type(name = "entity_properties", value = EntityPropertiesCondition.class),
		@Type(name = "has_mark_variant", value = HasMarkVariantCondition.class),
		@Type(name = "random_chance", value = RandomChanceCondition.class),
		@Type(name = "random_chance_with_looting", value = RandomChanceWithLootingCondition.class),
		@Type(name = "random_difficulty_chance", value = RandomDifficultyChanceCondition.class),
		@Type(name = "random_regional_difficulty_chance", value = RandomRegionalDifficultyChanceCondition.class),
})
public interface LootTableCondition extends PackNode {
}
