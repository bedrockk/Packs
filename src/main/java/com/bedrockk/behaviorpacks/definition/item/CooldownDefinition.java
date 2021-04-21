package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
public class CooldownDefinition implements ItemComponentNode {
    private Category category;
    private double duration;

    public enum Category {
        CHORUSFRUIT,
        ENDER_PEARL;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
