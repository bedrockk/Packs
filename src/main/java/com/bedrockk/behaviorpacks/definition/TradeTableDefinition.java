package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.Range;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class TradeTableDefinition implements Definition {
    private List<Tier> tiers;

    @Data
    public static class Tier implements PackNode {
        private Integer totalExpRequired;
        private List<Trade> trades;
        private List<Group> groups;
    }

    @Data
    public static class Group implements PackNode {
        private List<Trade> trades;
        private int numToSelect;
    }

    @Data
    public static class Trade implements PackNode {
        private List<WantEntry> wants;
        private List<GiveEntry> gives;
        private Integer tradeExp;
        private Integer maxUses;
        @JsonInclude()
        private Boolean rewardExp;
    }

    @Data
    public static class WantEntry implements PackNode {
        private String item;
        private Range quantity;
        private List<LootTableFunction> functions;
        private Double priceMultiplier;
    }

    @Data
    public static class GiveEntry implements PackNode {
        private String item;
        private Range quantity;
        private List<LootTableFunction> functions;
        private List<GiveEntry> choice;
    }
}
