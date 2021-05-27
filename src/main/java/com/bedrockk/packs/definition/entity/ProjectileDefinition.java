package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ProjectileDefinition implements EntityComponentDefinition {
	private OnHit onHit;

	private String shootSound;
	private String hitSound;
	private String hitGroundSound;
	private double angleOffset;
	@Builder.Default
	private double gravity = 0.05;
	@Builder.Default
	private double inertia = 0.99;
	@Builder.Default
	private double liquidInertia = 0.6;
	@Builder.Default
	private double power = 1.3;
	private double anchor;
	private double uncertaintyBase;
	private double uncertaintyMultiplier;

	private boolean isDangerous;
	@Builder.Default
	private boolean multipleTargets = true;
	private boolean reflectOnHurt;
	private boolean catchFire;
	private boolean stopOnHurt;
	private boolean semiRandomDiffDamage;
	@Builder.Default
	private boolean shootTarget = true;
	private boolean shouldBounce;
	private boolean homing;

	private ImmutableVec3 offset;

	@Data
	@Builder
	@Jacksonized
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
	@Builder
	@Jacksonized
	public static class DefinitionEvent implements PackNode {
		private boolean affectProjectile;
		private boolean affectShooter;
		private boolean affectTarget;
		private boolean affectSplashArea;
		private double splashArea;
		private EntityEventTriggerDefinition eventTrigger;
	}

	@Data
	@Builder
	@Jacksonized
	public static class GrantXp implements PackNode {
		private int minXP;
		private int maxXP;
		private int xp;
	}

	@Data
	@Builder
	@Jacksonized
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
	@Builder
	@Jacksonized
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
	@Builder
	@Jacksonized
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
	@Builder
	@Jacksonized
	public static class MobEffect implements PackNode {
		private EffectType effect;
		private int duration;
		private int durationEasy;
		private int durationNormal;
		private int durationHard;
		private int amplifier;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class StickInGround implements PackNode {
		private double shadeTime;
	}

	@Data
	@Builder
	@Jacksonized
	public static class ParticleOnHit implements PackNode {
		private String particleType;
		private int numParticles;
		private boolean onEntityHit;
		private boolean onOtherHit;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class CatchFire implements PackNode {
		private boolean fireAffectedByGriefing;
	}
}