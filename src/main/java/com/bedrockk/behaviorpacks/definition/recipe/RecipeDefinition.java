package com.bedrockk.behaviorpacks.definition.recipe;

import com.bedrockk.behaviorpacks.definition.VersionedDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class RecipeDefinition extends VersionedDefinition {

    private Map<String, DefinitionDescription> description;
    private List<String> tags;

    @Data
    public static class ItemEntry {
        private String item;
        private int data = 0;
        private int count = 1;
    }
}
