package com.bedrockk.behaviorpacks.type;

public enum EquipmentSlotType {
    ANY,
    ARMOR,
    FEET,
    HAND,
    HEAD,
    LEG,
    TORSO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
