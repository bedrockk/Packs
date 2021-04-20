package com.bedrockk.behaviorpacks.description.property;

import lombok.Data;

import java.nio.file.Path;
import java.util.List;

@Data
public class LootDescription implements PropertyDescription {
    private Path table;
}
