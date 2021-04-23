package com.bedrockk.behaviorpacks.definition.entity;

import lombok.Data;

import java.nio.file.Path;
import java.util.List;

@Data
public class EquipmentDefinition implements EntityComponentDefinition {
    private List<Entry> slotDropChance;
    private Path table;

    @Data
    public static class Entry {
        private int slot;
        private double dropChance;
    }
}
