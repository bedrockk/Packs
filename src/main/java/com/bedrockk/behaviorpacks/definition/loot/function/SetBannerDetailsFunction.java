package com.bedrockk.behaviorpacks.definition.loot.function;

import com.bedrockk.behaviorpacks.definition.loot.LootTableFunction;
import lombok.Data;

import java.util.List;

// TODO: converter for format version < 1.16.100
@Data
public class SetBannerDetailsFunction extends LootTableFunction {
    private String type; // default or illager_captain
    private String baseColor;
    private List<Pattern> patterns;

    @Data
    public static class Pattern {
        private String pattern;
        private String color;
    }
}
