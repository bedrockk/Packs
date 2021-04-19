package com.bedrockk.behaviorpacks.type;

public enum InventoryType {
    MINECART_CHEST,
    HORSE,
    MINECART_HOPPER,
    CONTAINER,
    INVENTORY,
    HOPPER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
