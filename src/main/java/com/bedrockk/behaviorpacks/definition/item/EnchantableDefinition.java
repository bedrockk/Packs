package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.Locale;

@Data
public class EnchantableDefinition implements ItemComponentDefinition {
    private EnchantSlot slot;
    private int value;

    public enum EnchantSlot {
        ALL,
        BOW,
        CARROT_STICK,
        ARMOR_FEET,
        ARMOR_TORSO,
        ARMOR_HEAD,
        ARMOR_LEGS,
        HOE,
        PICKAXE,
        SWORD,
        ELYTRA,
        FISHING_ROD,
        FLINTSTEEL,
        SHEARS,
        COSMETIC_HEAD;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
