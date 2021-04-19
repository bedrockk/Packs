package com.bedrockk.behaviorpacks.description.definition;

import lombok.Data;

import java.util.List;

@Data
public class ScriptsDescription implements DefinitionDescription {
    private List<String> animate;
}
