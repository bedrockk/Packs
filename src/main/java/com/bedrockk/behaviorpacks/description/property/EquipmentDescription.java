package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.util.List;

@Data
public class EquipmentDescription implements PropertyDescription {
    private List<Entry> slotDropChance;
    private String table;

    @Data
    public static class Entry {
        private int slot;
        private double dropChance;
    }
}
