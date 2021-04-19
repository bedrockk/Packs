package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.description.attribute.AttackDescription;
import com.bedrockk.behaviorpacks.description.attribute.SpellEffectsDescription;
import com.bedrockk.behaviorpacks.description.attribute.StrengthDescription;
import com.bedrockk.behaviorpacks.description.property.AmbientSoundIntervalDescription;
import com.bedrockk.behaviorpacks.description.property.CanClimbDescription;
import com.bedrockk.behaviorpacks.description.property.CanFlyDescription;
import com.bedrockk.behaviorpacks.description.property.CanPowerJumpDescription;
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
        @Type(name = EntityComponentIds.AMBIENT_SOUND_INTERVAL, value = AmbientSoundIntervalDescription.class),
        @Type(name = EntityComponentIds.CAN_CLIMB, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.CAN_FLY, value = CanFlyDescription.class),
        @Type(name = EntityComponentIds.CAN_POWER_JUMP, value = CanPowerJumpDescription.class),
        @Type(name = EntityComponentIds.COLLISION_BOX, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.COLOR2, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.COLOR, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.DEFAULT_LOOK_ANGLE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.EQUIPMENT, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.TYPE_FAMILY, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.FIRE_IMMUNE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.FLOATS_IN_LIQUID, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.FLYING_SPEED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.FRICTION_MODIFIER, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.GROUND_OFFSET, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.INPUT_GROUND_CONTROLLED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_BABY, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_CHARGED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_CHESTED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_DYEABLE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_HIDDEN_WHEN_INVISIBLE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_IGNITED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_ILLAGER_CAPTAIN, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_SADDLED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_SHAKING, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_SHEARED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_STUNNED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.IS_TAMED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.ITEM_CONTROLLABLE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.LOOT, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.MARK_VARIANT, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.PUSH_THROUGH, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.SCALE, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.SKIN_ID, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.SOUND_VOLUME, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.VARIANT, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.WALK_ANIMATION_SPEED, value = CanClimbDescription.class),
        @Type(name = EntityComponentIds.WANTS_JOCKEY, value = CanClimbDescription.class),
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
