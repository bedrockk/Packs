package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UseOnDefinition implements ItemComponentDefinition {
    private List<String> blocks = new ArrayList<>();
}
