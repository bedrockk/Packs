package com.bedrockk.behaviorpacks.type;

public enum EffectType {
    ALL,
    ABSORPTION,
    BAD_OMEN,
    BLINDNESS,
    CONDUIT_POWER,
    FATAL_POISON,
    FIRE_RESISTANCE,
    HASTE,
    HEALTH_BOOST,
    HUNGER,
    INSTANT_DAMAGE,
    INSTANT_HEALTH,
    INVISIBILITY,
    JUMP_BOOST,
    LEVITATION,
    MINING_FATIGUE,
    NAUSEA,
    NIGHT_VISION,
    POISON,
    REGENERATION,
    RESISTANCE,
    SATURATION,
    SLOW_FALLING,
    SLOWNESS,
    SPEED,
    STRENGTH,
    VILLAGE_HERO,
    WATER_BREATHING,
    WEAKNESS,
    WITHER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
