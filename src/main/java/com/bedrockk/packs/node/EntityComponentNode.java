package com.bedrockk.packs.node;

import com.bedrockk.packs.definition.entity.*;
import com.bedrockk.packs.definition.entity.goal.*;
import com.bedrockk.packs.description.entity.*;
import com.bedrockk.packs.json.NamedTypeResolverBuilder;
import com.bedrockk.packs.utils.EntityComponentIds;
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
		@Type(name = EntityComponentIds.ON_WAKE_WITH_OWNER, value = OnWakeWithOwnerDescription.class),
		// behaviors & components
		@Type(name = EntityComponentIds.BEHAVIOR_ADMIRE_ITEM, value = AdmireItemGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_AVOID_BLOCK, value = AvoidBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_AVOID_MOB_TYPE, value = AvoidMobTypeGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_BARTER, value = BarterGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_BEG, value = BegGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_BREAK_DOOR, value = BreakDoorGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_BREED, value = BreedGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_CELEBRATE, value = CelebrateGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_CHARGE_ATTACK, value = ChargeAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_CHARGE_HELD_ITEM, value = ChargeHeldItemGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_CIRCLE_AROUND_ANCHOR, value = CircleAroundAnchorGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_CONTROLLED_BY_PLAYER, value = ControlledByPlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DEFEND_TRUSTED_TARGET, value = DefendTrustedTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DEFEND_VILLAGE_TARGET, value = DefendVillageTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DELAYED_ATTACK, value = DelayedAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DOOR_INTERACT, value = DoorInteractGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRINK_POTION, value = DrinkPotionGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONLANDING, value = DragonLandingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONFLAMING, value = DragonFlamingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONSCANNING, value = DragonScanningGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONTAKEOFF, value = DragonTakeoffGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONCHARGEPLAYER, value = DragonChargePlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONSTRAFEPLAYER, value = DragonStrafePlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONHOLDINGPATTERN, value = DragonHoldingPatternGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DRAGONDEATH, value = DragonDeathGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_DROP_ITEM_FOR, value = DropItemForGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_EAT_BLOCK, value = EatBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_EAT_CARRIED_ITEM, value = EatCarriedItemGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_ENDERMAN_LEAVE_BLOCK, value = EndermanLeaveBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_ENDERMAN_TAKE_BLOCK, value = EndermanTakeBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_EQUIP_ITEMS, value = EquipItemsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_EXPLORE_OUTSKIRTS, value = ExploreOutskirtsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FIND_COVER, value = FindCoverGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FIND_MOUNT, value = FindMountGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FIND_UNDERWATER_TREASURE, value = FindUnderwaterTreasureGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FLEE_SUN, value = FleeSunGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FLOAT, value = FloatGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FLOAT_WANDER, value = FloatWanderGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FOLLOW_CARAVAN, value = FollowCaravanGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FOLLOW_MOB, value = FollowMobGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FOLLOW_OWNER, value = FollowOwnerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FOLLOW_PARENT, value = FollowParentGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_FOLLOW_TARGET_CAPTAIN, value = FollowTargetCaptainGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_GO_HOME, value = GoHomeGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_GUARDIAN_ATTACK, value = GuardianAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_HARVEST_FARM_BLOCK, value = HarvestFarmBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_HIDE, value = HideGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_HOVER, value = HoverGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_HURT_BY_TARGET, value = HurtByTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_INSPECT_BOOKSHELF, value = InspectBookshelfGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_KNOCKBACK_ROAR, value = KnockbackRoarGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_JUMP_TO_BLOCK, value = JumpToBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LAY_EGG, value = LayEggGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LAY_DOWN, value = LayDownGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LEAP_AT_TARGET, value = LeapAtTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LOOK_AT_ENTITY, value = LookAtEntityGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LOOK_AT_PLAYER, value = LookAtPlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LOOK_AT_TARGET, value = LookAtTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_LOOK_AT_TRADING_PLAYER, value = LookAtTradingPlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MAKE_LOVE, value = MakeLoveGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MELEE_ATTACK, value = MeleeAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MINGLE, value = MingleGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOUNT_PATHING, value = MountPathingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_INDOORS, value = MoveIndoorsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_THROUGH_VILLAGE, value = MoveThroughVillageGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TOWARDS_RESTRICTION, value = MoveTowardsRestrictionGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TOWARDS_DWELLING_RESTRICTION, value = MoveTowardsDwellingRestrictionGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TOWARDS_HOME_RESTRICTION, value = MoveTowardsHomeRestrictionGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TOWARDS_TARGET, value = MoveTowardsTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_BLOCK, value = MoveToBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_LAND, value = MoveToLandGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_POI, value = MoveToPoiGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_LAVA, value = MoveToLavaGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_RANDOM_BLOCK, value = MoveToRandomBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_VILLAGE, value = MoveToVillageGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_MOVE_TO_WATER, value = MoveToWaterGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_NAP, value = NapGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_NEAREST_ATTACKABLE_TARGET, value = NearestAttackableTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_NEAREST_PRIORITIZED_ATTACKABLE_TARGET, value = NearestPrioritizedAttackableTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OCELOTATTACK, value = OcelotAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OCELOT_SIT_ON_BLOCK, value = OcelotSitOnBlockGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OFFER_FLOWER, value = OfferFlowerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OPEN_DOOR, value = OpenDoorGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OWNER_HURT_BY_TARGET, value = OwnerHurtByTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_OWNER_HURT_TARGET, value = OwnerHurtTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PANIC, value = PanicGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PEEK, value = PeekGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PET_SLEEP_WITH_OWNER, value = PetSleepWithOwnerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PICKUP_ITEMS, value = PickupItemsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PLAY, value = PlayGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PLAY_DEAD, value = PlayDeadGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_PLAYER_RIDE_TAMED, value = PlayerRideTamedGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RAID_GARDEN, value = RaidGardenGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_BREACH, value = RandomBreachGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_FLY, value = RandomFlyGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_HOVER, value = RandomHoverGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_LOOK_AROUND, value = RandomLookAroundGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_LOOK_AROUND_AND_SIT, value = RandomLookAroundAndSitGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_SITTING, value = RandomSittingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_STROLL, value = RandomStrollGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANDOM_SWIM, value = RandomSwimGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RANGED_ATTACK, value = RangedAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RECEIVE_LOVE, value = ReceiveLoveGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RAM_ATTACK, value = RamAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RESTRICT_SUN, value = RestrictSunGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RESTRICT_OPEN_DOOR, value = RestrictOpenDoorGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RISE_TO_LIQUID_LEVEL, value = RiseToLiquidLevelGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_ROLL, value = RollGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_RUN_AROUND_LIKE_CRAZY, value = RunAroundLikeCrazyGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SCARED, value = ScaredGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SEND_EVENT, value = SendEventGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SHARE_ITEMS, value = ShareItemsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SKELETON_HORSE_TRAP, value = SkeletonHorseTrapGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SILVERFISH_WAKE_UP_FRIENDS, value = SilverfishWakeUpFriendsGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SILVERFISH_MERGE_WITH_STONE, value = SilverfishMergeWithStoneGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SLEEP, value = SleepGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SLIME_FLOAT, value = SlimeFloatGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SLIME_ATTACK, value = SlimeAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SLIME_RANDOM_DIRECTION, value = SlimeRandomDirectionGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SLIME_KEEP_ON_JUMPING, value = SlimeKeepOnJumpingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SNACKING, value = SnackingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SNEEZE, value = SneezeGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SQUID_MOVE_AWAY_FROM_GROUND, value = SquidMoveAwayFromGroundGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SQUID_FLEE, value = SquidFleeGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SQUID_IDLE, value = SquidIdleGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SQUID_DIVE, value = SquidDiveGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SQUID_OUT_OF_WATER, value = SquidOutOfWaterGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_STALK_AND_POUNCE_ON_TARGET, value = StalkAndPounceOnTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_STAY_WHILE_SITTING, value = StayWhileSittingGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_STOMP_ATTACK, value = StompAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_STOMP_TURTLE_EGG, value = StompTurtleEggGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SUMMON_ENTITY, value = SummonEntityGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SWELL, value = SwellGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SWIM_IDLE, value = SwimIdleGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SWIM_WANDER, value = SwimWanderGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SWIM_WITH_ENTITY, value = SwimWithEntityGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_SWOOP_ATTACK, value = SwoopAttackGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_TAKE_FLOWER, value = TakeFlowerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_TEMPT, value = TemptGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_TRADE_INTEREST, value = TradeInterestGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_TRADE_WITH_PLAYER, value = TradeWithPlayerGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_VEX_COPY_OWNER_TARGET, value = VexCopyOwnerTargetGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_VEX_RANDOM_MOVE, value = VexRandomMoveGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_WITHER_RANDOM_ATTACK_POS_GOAL, value = WitherRandomAttackPosGoalGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_WITHER_TARGET_HIGHEST_DAMAGE, value = WitherTargetHighestDamageGoalDefinition.class),
		@Type(name = EntityComponentIds.BEHAVIOR_WORK, value = WorkGoalDefinition.class),
		@Type(name = EntityComponentIds.ADDRIDER, value = AddRiderDefinition.class),
		@Type(name = EntityComponentIds.ADMIRE_ITEM, value = AdmireItemDefinition.class),
		@Type(name = EntityComponentIds.AGEABLE, value = AgeableDefinition.class),
		@Type(name = EntityComponentIds.AMBIENT_SOUND_INTERVAL, value = AmbientSoundIntervalDefinition.class),
		@Type(name = EntityComponentIds.ANGRY, value = AngryDefinition.class),
		@Type(name = EntityComponentIds.AREA_ATTACK, value = AreaAttackDefinition.class),
		@Type(name = EntityComponentIds.ATTACK_COOLDOWN, value = AttackCooldownDefinition.class),
		@Type(name = EntityComponentIds.ATTACK_DAMAGE, value = AttackDamageDefinition.class),
		@Type(name = EntityComponentIds.BALLOONABLE, value = BalloonableDefinition.class),
		@Type(name = EntityComponentIds.BARTER, value = BarterDefinition.class),
		@Type(name = EntityComponentIds.BLOCK_SENSOR, value = BlockSensorDefinition.class),
		@Type(name = EntityComponentIds.BOOSTABLE, value = BoostableDefinition.class),
		@Type(name = EntityComponentIds.BOSS, value = BossDefinition.class),
		@Type(name = EntityComponentIds.BREAK_BLOCKS, value = BreakBlocksDefinition.class),
		@Type(name = EntityComponentIds.BREATHABLE, value = BreathableDefinition.class),
		@Type(name = EntityComponentIds.BUOYANT, value = BuoyantDefinition.class),
		@Type(name = EntityComponentIds.BREEDABLE, value = BreedableDefinition.class),
		@Type(name = EntityComponentIds.BRIBEABLE, value = BribeableDefinition.class),
		@Type(name = EntityComponentIds.BURNS_IN_DAYLIGHT, value = BurnsInDaylightDefinition.class),
		@Type(name = EntityComponentIds.CAN_CLIMB, value = CanClimbDefinition.class),
		@Type(name = EntityComponentIds.CAN_FLY, value = CanFlyDefinition.class),
		@Type(name = EntityComponentIds.CAN_FLY, value = CanFlyDefinition.class),
		@Type(name = EntityComponentIds.CAN_POWER_JUMP, value = CanPowerJumpDefinition.class),
		@Type(name = EntityComponentIds.CELEBRATE_HUNT, value = CelebrateHuntDefinition.class),
		@Type(name = EntityComponentIds.INSIDE_BLOCK_NOTIFIER, value = InsideBlockNotifierDefinition.class),
		@Type(name = EntityComponentIds.COLLISION_BOX, value = CollisionBoxDefinition.class),
		@Type(name = EntityComponentIds.CONDITIONAL_BANDWIDTH_OPTIMIZATION, value = ConditionalBandwidthOptimizationDefinition.class),
		@Type(name = EntityComponentIds.COLOR, value = ColorDefinition.class),
		@Type(name = EntityComponentIds.COLOR2, value = Color2Definition.class),
		@Type(name = EntityComponentIds.COMBAT_REGENERATION, value = CombatRegenerationDefinition.class),
		@Type(name = EntityComponentIds.CUSTOM_HIT_TEST, value = CustomHitTestDefinition.class),
		@Type(name = EntityComponentIds.DAMAGE_OVER_TIME, value = DamageOverTimeDefinition.class),
		@Type(name = EntityComponentIds.DAMAGE_SENSOR, value = DamageSensorDefinition.class),
		@Type(name = EntityComponentIds.DEFAULT_LOOK_ANGLE, value = DefaultLookAngleDefinition.class),
		@Type(name = EntityComponentIds.DESPAWN, value = DespawnDefinition.class),
		@Type(name = EntityComponentIds.DRYING_OUT_TIMER, value = DryingOutTimerDefinition.class),
		@Type(name = EntityComponentIds.DWELLER, value = DwellerDefinition.class),
		@Type(name = EntityComponentIds.ECONOMY_TRADE_TABLE, value = EconomyTradeTableDefinition.class),
		@Type(name = EntityComponentIds.ENVIRONMENT_SENSOR, value = EnvironmentSensorDefinition.class),
		@Type(name = EntityComponentIds.ENTITY_SENSOR, value = EntitySensorDefinition.class),
		@Type(name = EntityComponentIds.EQUIPMENT, value = EquipmentDefinition.class),
		@Type(name = EntityComponentIds.EQUIP_ITEM, value = EquipItemDefinition.class),
		@Type(name = EntityComponentIds.EQUIPPABLE, value = EquippableDefinition.class),
		@Type(name = EntityComponentIds.EXPERIENCE_REWARD, value = ExperienceRewardDefinition.class),
		@Type(name = EntityComponentIds.EXPLODE, value = ExplodeDefinition.class),
		@Type(name = EntityComponentIds.FIRE_IMMUNE, value = FireImmuneDefinition.class),
		@Type(name = EntityComponentIds.FLOATS_IN_LIQUID, value = FloatsInLiquidDefinition.class),
		@Type(name = EntityComponentIds.FLOCKING, value = FlockingDefinition.class),
		@Type(name = EntityComponentIds.FLYING_SPEED, value = FlyingSpeedDefinition.class),
		@Type(name = EntityComponentIds.FOLLOW_RANGE, value = FollowRangeDefinition.class),
		@Type(name = EntityComponentIds.FOOT_SIZE, value = FootSizeDefinition.class),
		@Type(name = EntityComponentIds.FRICTION_MODIFIER, value = FrictionModifierDefinition.class),
		@Type(name = EntityComponentIds.GENETICS, value = GeneticsDefinition.class),
		@Type(name = EntityComponentIds.GIVEABLE, value = GiveableDefinition.class),
		@Type(name = EntityComponentIds.GROUND_OFFSET, value = GroundOffsetDefinition.class),
		@Type(name = EntityComponentIds.GROUP_SIZE, value = GroupSizeDefinition.class),
		@Type(name = EntityComponentIds.GROWS_CROP, value = GrowsCropDefinition.class),
		@Type(name = EntityComponentIds.HEALABLE, value = HealableDefinition.class),
		@Type(name = EntityComponentIds.HEALTH, value = HealthDefinition.class),
		@Type(name = EntityComponentIds.HIDE, value = HideDefinition.class),
		@Type(name = EntityComponentIds.HOME, value = HomeDefinition.class),
		@Type(name = EntityComponentIds.HORSE_JUMP_STRENGTH, value = HorseJumpStrengthDefinition.class),
		@Type(name = EntityComponentIds.HURT_ON_CONDITION, value = HurtOnConditionDefinition.class),
		@Type(name = EntityComponentIds.INPUT_GROUND_CONTROLLED, value = InputGroundControlledDefinition.class),
		@Type(name = EntityComponentIds.INSOMNIA, value = InsomniaDefinition.class),
		@Type(name = EntityComponentIds.INSTANT_DESPAWN, value = InstantDespawnDefinition.class),
		@Type(name = EntityComponentIds.INTERACT, value = InteractDefinition.class),
		@Type(name = EntityComponentIds.INVENTORY, value = InventoryDefinition.class),
		@Type(name = EntityComponentIds.IS_BABY, value = IsBabyDefinition.class),
		@Type(name = EntityComponentIds.IS_CHARGED, value = IsChargedDefinition.class),
		@Type(name = EntityComponentIds.IS_CHESTED, value = IsChestedDefinition.class),
		@Type(name = EntityComponentIds.IS_DYEABLE, value = IsDyeableDefinition.class),
		@Type(name = EntityComponentIds.IS_HIDDEN_WHEN_INVISIBLE, value = IsHiddenWhenInvisibleDefinition.class),
		@Type(name = EntityComponentIds.IS_IGNITED, value = IsIgnitedDefinition.class),
		@Type(name = EntityComponentIds.IS_ILLAGER_CAPTAIN, value = IsIllagerCaptainDefinition.class),
		@Type(name = EntityComponentIds.IS_SADDLED, value = IsSaddledDefinition.class),
		@Type(name = EntityComponentIds.IS_SHAKING, value = IsShakingDefinition.class),
		@Type(name = EntityComponentIds.IS_SHEARED, value = IsShearedDefinition.class),
		@Type(name = EntityComponentIds.IS_STACKABLE, value = IsStackableDefinition.class),
		@Type(name = EntityComponentIds.IS_STUNNED, value = IsStunnedDefinition.class),
		@Type(name = EntityComponentIds.IS_TAMED, value = IsTamedDefinition.class),
		@Type(name = EntityComponentIds.ITEM_CONTROLLABLE, value = ItemControllableDefinition.class),
		@Type(name = EntityComponentIds.ITEM_HOPPER, value = ItemHopperDefinition.class),
		@Type(name = EntityComponentIds.JUMP_DYNAMIC, value = JumpDynamicDefinition.class),
		@Type(name = EntityComponentIds.JUMP_STATIC, value = JumpStaticDefinition.class),
		@Type(name = EntityComponentIds.KNOCKBACK_RESISTANCE, value = KnockbackResistanceDefinition.class),
		@Type(name = EntityComponentIds.LAVA_MOVEMENT, value = LavaMovementDefinition.class),
		@Type(name = EntityComponentIds.LEASHABLE, value = LeashableDefinition.class),
		@Type(name = EntityComponentIds.LOOKAT, value = LookAtDefinition.class),
		@Type(name = EntityComponentIds.LOOT, value = LootDefinition.class),
		@Type(name = EntityComponentIds.MANAGED_WANDERING_TRADER, value = ManagedWanderingTraderDefinition.class),
		@Type(name = EntityComponentIds.MARK_VARIANT, value = MarkVariantDefinition.class),
		@Type(name = EntityComponentIds.MOB_EFFECT, value = MobEffectDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT, value = MovementDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_AMPHIBIOUS, value = MovementAmphibiousDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_BASIC, value = MovementBasicDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_FLY, value = MovementFlyDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_GENERIC, value = MovementGenericDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_HOVER, value = MovementHoverDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_JUMP, value = MovementJumpDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_GLIDE, value = MovementGlideDefinition.class),
		@Type(name = EntityComponentIds.SKIN_ID, value = SkinIdDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_SKIP, value = MovementSkipDefinition.class),
		@Type(name = EntityComponentIds.MOVEMENT_SWAY, value = MovementSwayDefinition.class),
		@Type(name = EntityComponentIds.NAMEABLE, value = NameableDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_CLIMB, value = NavigationClimbDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_FLOAT, value = NavigationFloatDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_FLY, value = NavigationFlyDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_GENERIC, value = NavigationGenericDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_HOVER, value = NavigationHoverDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_SWIM, value = NavigationSwimDefinition.class),
		@Type(name = EntityComponentIds.NAVIGATION_WALK, value = NavigationWalkDefinition.class),
		@Type(name = EntityComponentIds.NPC, value = NpcDefinition.class),
		@Type(name = EntityComponentIds.OUT_OF_CONTROL, value = OutOfControlDefinition.class),
		@Type(name = EntityComponentIds.PEEK, value = PeekDefinition.class),
		@Type(name = EntityComponentIds.PERSISTENT, value = PersistentDefinition.class),
		@Type(name = EntityComponentIds.PHYSICS, value = PhysicsDefinition.class),
		@Type(name = EntityComponentIds.PLAYER_SATURATION, value = PlayerSaturationDefinition.class),
		@Type(name = EntityComponentIds.PLAYER_EXHAUSTION, value = PlayerExhaustionDefinition.class),
		@Type(name = EntityComponentIds.PLAYER_LEVEL, value = PlayerLevelDefinition.class),
		@Type(name = EntityComponentIds.PLAYER_EXPERIENCE, value = PlayerExperienceDefinition.class),
		@Type(name = EntityComponentIds.PUSHABLE, value = PushableDefinition.class),
		@Type(name = EntityComponentIds.PUSH_THROUGH, value = PushThroughDefinition.class),
		@Type(name = EntityComponentIds.PREFERRED_PATH, value = PreferredPathDefinition.class),
		@Type(name = EntityComponentIds.PROJECTILE, value = ProjectileDefinition.class),
		@Type(name = EntityComponentIds.RAID_TRIGGER, value = RaidTriggerDefinition.class),
		@Type(name = EntityComponentIds.RAIL_MOVEMENT, value = RailMovementDefinition.class),
		@Type(name = EntityComponentIds.RAIL_SENSOR, value = RailSensorDefinition.class),
		@Type(name = EntityComponentIds.RAVAGER_BLOCKED, value = RavagerBlockedDefinition.class),
		@Type(name = EntityComponentIds.RIDEABLE, value = RideableDefinition.class),
		@Type(name = EntityComponentIds.SCAFFOLDING_CLIMBER, value = ScaffoldingClimberDefinition.class),
		@Type(name = EntityComponentIds.SCALE, value = ScaleDefinition.class),
		@Type(name = EntityComponentIds.SCALE_BY_AGE, value = ScaleByAgeDefinition.class),
		@Type(name = EntityComponentIds.SCHEDULER, value = SchedulerDefinition.class),
		@Type(name = EntityComponentIds.SHAREABLES, value = ShareablesDefinition.class),
		@Type(name = EntityComponentIds.SHOOTER, value = ShooterDefinition.class),
		@Type(name = EntityComponentIds.SITTABLE, value = SittableDefinition.class),
		@Type(name = EntityComponentIds.SOUND_VOLUME, value = SoundVolumeDefinition.class),
		@Type(name = EntityComponentIds.SPAWN_ENTITY, value = SpawnEntityDefinition.class),
		@Type(name = EntityComponentIds.STRENGTH, value = StrengthDefinition.class),
		@Type(name = EntityComponentIds.TAMEABLE, value = TameableDefinition.class),
		@Type(name = EntityComponentIds.TAMEMOUNT, value = TamemountDefinition.class),
		@Type(name = EntityComponentIds.TARGET_NEARBY_SENSOR, value = TargetNearbySensorDefinition.class),
		@Type(name = EntityComponentIds.TELEPORT, value = TeleportDefinition.class),
		@Type(name = EntityComponentIds.TICK_WORLD, value = TickWorldDefinition.class),
		@Type(name = EntityComponentIds.TIMER, value = TimerDefinition.class),
		@Type(name = EntityComponentIds.TRADE_RESUPPLY, value = TradeResupplyDefinition.class),
		@Type(name = EntityComponentIds.TRADE_TABLE, value = TradeTableDefinition.class),
		@Type(name = EntityComponentIds.TRAIL, value = TrailDefinition.class),
		@Type(name = EntityComponentIds.TRANSFORMATION, value = TransformationDefinition.class),
		@Type(name = EntityComponentIds.TRUSTING, value = TrustingDefinition.class),
		@Type(name = EntityComponentIds.TRUST, value = TrustDefinition.class),
		@Type(name = EntityComponentIds.TYPE_FAMILY, value = TypeFamilyDefinition.class),
		@Type(name = EntityComponentIds.UNDERWATER_MOVEMENT, value = UnderwaterMovementDefinition.class),
		@Type(name = EntityComponentIds.VARIANT, value = VariantDefinition.class),
		@Type(name = EntityComponentIds.WALK_ANIMATION_SPEED, value = WalkAnimationSpeedDefinition.class),
		@Type(name = EntityComponentIds.WANTS_JOCKEY, value = WantsJockeyDefinition.class),
		@Type(name = EntityComponentIds.WATER_MOVEMENT, value = WaterMovementDefinition.class)
})
public interface EntityComponentNode extends PackNode {
}