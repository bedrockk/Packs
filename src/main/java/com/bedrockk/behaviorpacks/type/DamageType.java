package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum DamageType {
    OVERRIDE,
    CONTACT,
    NONE,
    LAVA,
    ENTITY_ATTACK,
    FIRE_TICK,
    PROJECTILE,
    SUFFOCATION,
    FALL,
    FATAL,
    STARVE,
    FIRE,
    DROWNING,
    BLOCK_EXPLOSION,
    ENTITY_EXPLOSION,
    VOID,
    SUICIDE,
    MAGIC,
    WITHER,
    CHARGING,
    ANVIL,
    THORNS,
    FALLING_BLOCK,
    PISTON,
    MAGMA,
    FIREWORKS,
    TEMPERATURE,
    LIGHTNING,
    ALL,
    FLY_INTO_WALL;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
