package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DamageableDefinition implements ItemComponentNode {
    private int maxDamage;
    private List<String> repairItems = new ArrayList<>();
    private Range damageChance;
}
