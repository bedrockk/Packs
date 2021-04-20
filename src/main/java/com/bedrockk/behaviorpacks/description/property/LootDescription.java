package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.nio.file.Path;

@Data
public class LootDescription implements PropertyDescription {
    private Path table;
}
