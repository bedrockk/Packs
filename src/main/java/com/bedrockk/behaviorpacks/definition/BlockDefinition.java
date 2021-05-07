package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.definition.block.BlockEventDefinition;
import com.bedrockk.behaviorpacks.description.DefinitionDescription;
import com.bedrockk.behaviorpacks.node.BlockComponentNode;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;

import java.util.List;
import java.util.Map;

public class BlockDefinition extends VersionedDefinition {
    private Map<String, DefinitionDescription> description;
    private List<Permutation> permutations;
    private Map<String, BlockComponentNode> components;
    private Map<String, BlockEventDefinition> events;

    public static class Permutation implements PackNode {
        private ExpressionNode condition;
        private Map<String, BlockComponentNode> components;
    }
}
