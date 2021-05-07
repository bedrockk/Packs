package com.bedrockk.behaviorpacks.definition.recipe;

import com.bedrockk.behaviorpacks.definition.VersionedDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@Getter
public abstract class RecipeDefinition extends VersionedDefinition {

    private Map<String, DefinitionDescription> description;
    private List<String> tags;

    @Data
    public static class ItemEntry implements PackNode {
        private String item;
        private int data = 0;
        private int count = 1;
    }
}
