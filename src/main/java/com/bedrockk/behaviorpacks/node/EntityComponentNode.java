package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.description.entity.AttackDescription;
import com.bedrockk.behaviorpacks.description.entity.SpellEffectsDescription;
import com.bedrockk.behaviorpacks.description.entity.StrengthDescription;
import com.bedrockk.behaviorpacks.definition.entity.AmbientSoundIntervalDefinition;
import com.bedrockk.behaviorpacks.definition.entity.CanClimbDefinition;
import com.bedrockk.behaviorpacks.definition.entity.CanFlyDefinition;
import com.bedrockk.behaviorpacks.definition.entity.CanPowerJumpDefinition;
import com.bedrockk.behaviorpacks.description.trigger.*;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.bedrockk.behaviorpacks.utils.EntityComponentIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
        // attributes
        @Type(name = EntityComponentIds.ATTACK, value = AttackDescription.class),
        @Type(name = EntityComponentIds.SPELL_EFFECTS, value = SpellEffectsDescription.class),
        @Type(name = EntityComponentIds.STRENGTH, value = StrengthDescription.class),
        // properties
        @Type(name = EntityComponentIds.AMBIENT_SOUND_INTERVAL, value = AmbientSoundIntervalDefinition.class),
        @Type(name = EntityComponentIds.CAN_CLIMB, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.CAN_FLY, value = CanFlyDefinition.class),
        @Type(name = EntityComponentIds.CAN_POWER_JUMP, value = CanPowerJumpDefinition.class),
        @Type(name = EntityComponentIds.COLLISION_BOX, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.COLOR2, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.COLOR, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.DEFAULT_LOOK_ANGLE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.EQUIPMENT, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.TYPE_FAMILY, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.FIRE_IMMUNE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.FLOATS_IN_LIQUID, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.FLYING_SPEED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.FRICTION_MODIFIER, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.GROUND_OFFSET, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.INPUT_GROUND_CONTROLLED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_BABY, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_CHARGED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_CHESTED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_DYEABLE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_HIDDEN_WHEN_INVISIBLE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_IGNITED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_ILLAGER_CAPTAIN, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_SADDLED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_SHAKING, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_SHEARED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_STUNNED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.IS_TAMED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.ITEM_CONTROLLABLE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.LOOT, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.MARK_VARIANT, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.PUSH_THROUGH, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.SCALE, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.SKIN_ID, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.SOUND_VOLUME, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.VARIANT, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.WALK_ANIMATION_SPEED, value = CanClimbDefinition.class),
        @Type(name = EntityComponentIds.WANTS_JOCKEY, value = CanClimbDefinition.class),
        // triggers
        @Type(name = EntityComponentIds.ON_DEATH, value = OnDeathDescription.class),
        @Type(name = EntityComponentIds.ON_FRIENDLY_ANGER, value = OnFriendlyAngerDescription.class),
        @Type(name = EntityComponentIds.ON_HURT_BY_PLAYER, value = OnHurtByPlayerDescription.class),
        @Type(name = EntityComponentIds.ON_HURT, value = OnHurtDescription.class),
        @Type(name = EntityComponentIds.ON_IGNITE, value = OnIgniteDescription.class),
        @Type(name = EntityComponentIds.ON_START_LANDING, value = OnStartLandingDescription.class),
        @Type(name = EntityComponentIds.ON_START_TAKEOFF, value = OnStartTakeOffDescription.class),
        @Type(name = EntityComponentIds.ON_TARGET_ACQUIRED, value = OnTargetAcquiredDescription.class),
        @Type(name = EntityComponentIds.ON_TARGET_ESCAPE, value = OnTargetEscapeDescription.class),
        @Type(name = EntityComponentIds.ON_WAKE_WITH_OWNER, value = OnWakeWithOwnerDescription.class)
        // TODO: behaviors
})
public interface EntityComponentNode extends BehaviorPackNode {
}
