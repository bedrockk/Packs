package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonUntil;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.type.Range;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonUntil("1.16.100")
public class DamageableDefinition implements ItemComponentNode {
	private int maxDamage;
	private List<String> repairItems = new ArrayList<>();
	private Range damageChance;
}
