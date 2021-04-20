package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.nio.file.Path;
import java.util.List;

@Data
public class EquipmentDescription implements PropertyDescription {
    private List<Entry> slotDropChance;
    private Path table;

    @Data
    public static class Entry {
        private int slot;
        private double dropChance;
    }
}
