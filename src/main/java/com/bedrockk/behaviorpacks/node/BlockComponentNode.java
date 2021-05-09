package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.description.block.*;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.bedrockk.behaviorpacks.utils.BlockComponentIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
        @Type(name = BlockComponentIds.BREAKONPUSH, value = BlockBreakOnPushDescription.class),
        @Type(name = BlockComponentIds.BREATHABILITY, value = BlockBreathabilityDescription.class),
        @Type(name = BlockComponentIds.DESTROY_TIME, value = BlockDestroyTimeDescription.class),
        @Type(name = BlockComponentIds.DISPLAY_NAME, value = BlockDisplayNameDescription.class),
        @Type(name = BlockComponentIds.ENTITY_COLLISION, value = BlockEntityCollisionDescription.class),
        @Type(name = BlockComponentIds.EXPLOSION_RESISTANCE, value = BlockExplodeableDescription.class),
        @Type(name = BlockComponentIds.FLAMMABLE, value = BlockFlammableDescription.class),
        @Type(name = BlockComponentIds.FRICTION, value = BlockFrictionDescription.class),
        @Type(name = BlockComponentIds.GEOMETRY, value = BlockGeometryDescription.class),
        @Type(name = BlockComponentIds.IMMOVABLE, value = BlockImmovableDescription.class),
        @Type(name = BlockComponentIds.BLOCK_LIGHT_ABSORPTION, value = BlockLightAbsorptionDescription.class),
        @Type(name = BlockComponentIds.BLOCK_LIGHT_EMISSION, value = BlockLightEmissionDescription.class),
        @Type(name = BlockComponentIds.LOOT, value = BlockLootDescription.class),
        @Type(name = BlockComponentIds.MAP_COLOR, value = BlockMapColorDescription.class),
        @Type(name = BlockComponentIds.MATERIAL_INSTANCES, value = BlockMaterialInstancesDescription.class),
        @Type(name = BlockComponentIds.PICK_COLLISION, value = BlockPickCollisionDescription.class),
        @Type(name = BlockComponentIds.PLACEMENT_FILTER, value = BlockPlacementFilterDescription.class),
        @Type(name = BlockComponentIds.PREVENTSJUMPING, value = BlockPreventsJumpingDescription.class),
        @Type(name = BlockComponentIds.TICKING, value = BlockQueuedTickingDescription.class),
        @Type(name = BlockComponentIds.RANDOM_TICKING, value = BlockRandomTickingDescription.class),
        @Type(name = BlockComponentIds.ROTATION, value = BlockRotationDescription.class),
        @Type(name = BlockComponentIds.UNIT_CUBE, value = BlockUnitCubeDescription.class),
        @Type(name = BlockComponentIds.UNWALKABLE, value = BlockUnwalkableDescription.class),
        @Type(name = BlockComponentIds.CRAFTING_TABLE, value = CraftingTableDescription.class),
        @Type(name = BlockComponentIds.ON_FALL_ON, value = OnFallOnTriggerDescription.class),
        @Type(name = BlockComponentIds.ON_INTERACT, value = OnInteractTriggerDescription.class),
        @Type(name = BlockComponentIds.ONLYPISTONPUSH, value = BlockOnlyPistonPushDescription.class),
        @Type(name = BlockComponentIds.ON_PLACED, value = OnPlacedTriggerDescription.class),
        @Type(name = BlockComponentIds.ON_PLAYER_DESTROYED, value = OnPlayerDestroyedTriggerDescription.class),
        @Type(name = BlockComponentIds.ON_PLAYER_PLACING, value = OnPlayerPlacingTriggerDescription.class),
        @Type(name = BlockComponentIds.ON_STEP_OFF, value = OnStepOffTriggerDescription.class),
        @Type(name = BlockComponentIds.ON_STEP_ON, value = OnStepOnTriggerDescription.class),
})
public interface BlockComponentNode extends PackNode {
}
