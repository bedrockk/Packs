package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.type.Range;
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
