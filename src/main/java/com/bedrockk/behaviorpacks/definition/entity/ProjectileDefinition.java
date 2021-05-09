package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.*;
import lombok.Data;

@Data
public class ProjectileDefinition implements EntityComponentDefinition {
	private OnHit onHit;

	private String shootSound;
	private String hitSound;
	private String hitGroundSound;
	private double angleOffset = 0.0;
	private double gravity = 0.05;
	private double inertia = 0.99;
	private double liquidInertia = 0.6;
	private double power = 1.3;
	private double anchor = 0.0;
	private double uncertaintyBase = 0.0;
	private double uncertaintyMultiplier = 0.0;

	private Boolean isDangerous = false;
	private boolean multipleTargets = true;
	private boolean reflectOnHurt = false;
	private boolean catchFire = false;
	private boolean stopOnHurt = false;
	private boolean semiRandomDiffDamage = false;
	private boolean shootTarget = true;
	private boolean shouldBounce = false;
	private boolean homing = false;

	private ImmutableVec3 offset;

	@Data
	public static class OnHit implements PackNode {
		private DefinitionEvent definitionEvent;
		private GrantXp grantXp;
		private SpawnAoeCloud spawnAoeCloud;
		private ImpactDamage impactDamage;
		private SpawnChance spawnChance;
		private MobEffect mobEffect;
		private StickInGround stickInGround;
		private EmptyObject thrownPotionEffect;
		private EmptyObject douseFire;
		private EmptyObject arrowEffect;
		private EmptyObject removeOnHit;
		private EmptyObject teleportOwner;
		private ParticleOnHit particleOnHit;
		private CatchFire catchFire;

	}

	@Data
	public static class DefinitionEvent implements PackNode {
		private boolean affectProjectile;
		private boolean affectShooter;
		private boolean affectTarget;
		private boolean affectSplashArea;
		private double splashArea;
		private EntityEventTriggerDefinition eventTrigger;
	}

	@Data
	public static class GrantXp implements PackNode {
		private int minXP;
		private int maxXP;
		private int xp;
	}

	@Data
	public static class SpawnAoeCloud implements PackNode {
		private double radius;
		private double radiusOnUse;
		private int potion;
		private String particle;
		private int duration;
		private ImmutableVec3 color;
		private boolean affectOwner;
		private int reapplicationDelay;
	}

	@Data
	public static class ImpactDamage implements PackNode {
		private ExpressionNode filter;
		private Range damage;
		private boolean knockback;
		private boolean semiRandomDiffDamage;
		private boolean destroyOnHit;
		private double maxCriticalDamage;
		private double minCriticalDamage;
		private double powerMultiplier;
		private boolean shouldBounce;
		private boolean channeling;
		private boolean setLastHurtRequiresDamage;
		private boolean destroyOnHitRequiresDamage;
	}

	@Data
	public static class SpawnChance implements PackNode {
		private double firstSpawnPercentChance;
		private double firstSpawnChance;
		private double secondSpawnPercentChance;
		private double secondSpawnChance;
		private int firstSpawnCount;
		private int secondSpawnCount;
		private boolean spawnMob;
		private String spawnDefinition;
		private boolean spawnBaby;
	}

	@Data
	public static class MobEffect implements PackNode {
		private EffectType effect;
		private int duration;
		private int durationEasy;
		private int durationNormal;
		private int durationHard;
		private int amplifier;
	}

	@Data
	public static class StickInGround implements PackNode {
		private double shadeTime;
	}

	@Data
	public static class ParticleOnHit implements PackNode {
		private String particleType;
		private int numParticles;
		private boolean onEntityHit;
		private boolean onOtherHit;
	}

	@Data
	public static class CatchFire implements PackNode {
		private boolean fireAffectedByGriefing;
	}
}