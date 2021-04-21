package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import lombok.Data;

import java.util.Locale;

@Data
public class FertilizerDefinition implements ItemComponentNode {
    public Type type;

    public enum Type {
        BONEMEAL,
        RAPID;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
