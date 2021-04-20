package com.bedrockk.behaviorpacks.definition.loot;

import com.bedrockk.behaviorpacks.definition.loot.condition.*;
import com.bedrockk.behaviorpacks.definition.loot.function.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "function", visible = true)
@JsonSubTypes({
        @Type(name = "enchant_book_for_trading", value = EnchantBookForTradingFunction.class),
        @Type(name = "enchant_random_gear", value = EnchantRandomGearFunction.class),
        @Type(name = "enchant_randomly", value = EnchantRandomlyFunction.class),
        @Type(name = "enchant_with_levels", value = EnchantWithLevelsFunction.class),
        @Type(name = "exploration_map", value = ExplorationMapFunction.class),
        @Type(name = "fill_container", value = FillContainerFunction.class),
        @Type(name = "looting_enchant", value = LootingEnchantFunction.class),
        @Type(name = "random_aux_val", value = RandomAuxValFunction.class),
        @Type(name = "random_block_state", value = RandomBlockStateFunction.class),
        @Type(name = "set_actor_id", value = SetActorIdFunction.class),
        @Type(name = "set_banner_details", value = SetBannerDetailsFunction.class),
        @Type(name = "set_book_contents", value = SetBookContentsFunction.class),
        @Type(name = "set_count", value = SetCountFunction.class),
        @Type(name = "set_damage", value = SetDamageFunction.class),
        @Type(name = "set_data", value = SetDataFunction.class),
        @Type(name = "set_lore", value = SetLoreFunction.class),
        @Type(name = "set_name", value = SetNameFunction.class),
        @Type(name = "specific_enchants", value = SpecificEnchantsFunction.class)
})
@Data
public abstract class LootTableFunction {
    private List<LootTableCondition> conditions;
}
