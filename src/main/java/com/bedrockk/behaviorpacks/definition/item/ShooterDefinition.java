package com.bedrockk.behaviorpacks.definition.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShooterDefinition implements ItemComponentDefinition {
    private List<Ammo> ammunition = new ArrayList<>();
    private int maxDrawDuration;
    private boolean scalePowerByDrawDuration = false;
    private boolean chargeOnDraw = false;

    @Data
    public static class Ammo {
        private String item;
        private boolean useOffhand = false;
        private boolean searchInventory = false;
        private boolean useInCreative = false;
    }
}
