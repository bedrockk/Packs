package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.type.SlotType;
import lombok.Data;

@Data
public class WearableDefinition implements ItemComponentDefinition {
    private SlotType slot;
}
