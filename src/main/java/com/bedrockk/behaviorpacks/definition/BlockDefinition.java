package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.block.BlockEventDefinition;
import com.bedrockk.behaviorpacks.description.definition.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.BlockComponentNode;
import com.bedrockk.behaviorpacks.type.MolangExpression;

import java.util.List;
import java.util.Map;

public class BlockDefinition extends VersionedDefinition {
    private Map<String, DefinitionDescription> description;
    private List<Permutation> permutations;
    private Map<String, BlockComponentNode> components;
    private Map<String, BlockEventDefinition> events;

    public static class Permutation {
        private MolangExpression condition;
        private Map<String, BlockComponentNode> components;
    }
}
