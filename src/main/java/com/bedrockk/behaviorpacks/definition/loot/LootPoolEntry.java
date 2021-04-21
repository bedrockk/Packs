package com.bedrockk.behaviorpacks.definition.loot;

import com.bedrockk.behaviorpacks.definition.loot.entry.EmptyEntry;
import com.bedrockk.behaviorpacks.definition.loot.entry.ItemEntry;
import com.bedrockk.behaviorpacks.definition.loot.entry.TableEntry;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @Type(name = "item", value = ItemEntry.class),
        @Type(name = "table", value = TableEntry.class),
        @Type(name = "empty", value = EmptyEntry.class)
})
@Data
public abstract class LootPoolEntry {
    private List<LootTableCondition> conditions;
}
