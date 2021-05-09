package com.bedrockk.behaviorpacks.node;

import com.bedrockk.behaviorpacks.definition.item.*;
import com.bedrockk.behaviorpacks.json.NamedTypeResolverBuilder;
import com.bedrockk.behaviorpacks.utils.ItemComponentIds;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
@JsonTypeResolver(NamedTypeResolverBuilder.class)
@JsonSubTypes({
		@Type(name = ItemComponentIds.USE_DURATION, value = UseDurationDefinition.class),
		@Type(name = ItemComponentIds.MAX_STACK_SIZE, value = MaxStackSizeDefinition.class),
		@Type(name = ItemComponentIds.MAX_DAMAGE, value = MaxDamageDefinition.class),
		@Type(name = ItemComponentIds.HAND_EQUIPPED, value = HandEquippedDefinition.class),
		@Type(name = ItemComponentIds.STACKED_BY_DATA, value = StackedByDataDefinition.class),
		@Type(name = ItemComponentIds.FOIL, value = FoilDefinition.class),
		@Type(name = ItemComponentIds.BUCKET, value = BucketDefinition.class),
		@Type(name = ItemComponentIds.BED, value = BedDefinition.class),
		@Type(name = ItemComponentIds.FRAME_COUNT, value = FrameCountDefinition.class),
		@Type(name = ItemComponentIds.ANIMATES_IN_TOOLBAR, value = AnimatesInToolbarDefinition.class),
		@Type(name = ItemComponentIds.IGNORES_PERMISSION, value = IgnoresPermissionDefinition.class),
		@Type(name = ItemComponentIds.MINING_SPEED, value = MiningSpeedDefinition.class),
		@Type(name = ItemComponentIds.DAMAGE, value = DamageDefinition.class),
		@Type(name = ItemComponentIds.CAN_DESTROY_IN_CREATIVE, value = CanDestroyInCreativeDefinition.class),
		@Type(name = ItemComponentIds.DYE_POWDER, value = DyePowderDefinition.class),
		@Type(name = ItemComponentIds.REQUIRES_INTERACT, value = RequiresInteractDefinition.class),
		@Type(name = ItemComponentIds.FIRE_CHARGE, value = FireChargeDefinition.class),
		@Type(name = ItemComponentIds.MIRRORED_ART, value = MirroredArtDefinition.class),
		@Type(name = ItemComponentIds.FISHING_ROD, value = FishingRodDefinition.class),
		@Type(name = ItemComponentIds.FLINT_AND_STEEL, value = FlintAndSteelDefinition.class),
		@Type(name = ItemComponentIds.BOTTLE, value = BottleDefinition.class),
		@Type(name = ItemComponentIds.LEAD, value = LeadDefinition.class),
		@Type(name = ItemComponentIds.NAME_TAG, value = NameTagDefinition.class),
		@Type(name = ItemComponentIds.EXPLODABLE, value = ExplodableDefinition.class),
		@Type(name = ItemComponentIds.SHOULD_DESPAWN, value = ShouldDespawnDefinition.class),
		@Type(name = ItemComponentIds.SADDLE, value = SaddleDefinition.class),
		@Type(name = ItemComponentIds.SHEARS, value = ShearsDefinition.class),
		@Type(name = ItemComponentIds.SKULL, value = SkullDefinition.class),
		@Type(name = ItemComponentIds.MOB_PLACER, value = MobPlacerDefinition.class),
		@Type(name = ItemComponentIds.LIQUID_CLIPPED, value = LiquidClippedDefinition.class),
		@Type(name = ItemComponentIds.ALLOW_OFF_HAND, value = AllowOffHandDefinition.class),
		@Type(name = ItemComponentIds.DOOR, value = DoorDefinition.class),
		@Type(name = ItemComponentIds.SIGN, value = SignDefinition.class),
		@Type(name = ItemComponentIds.PROJECTILE, value = ProjectileDefinition.class),
		@Type(name = ItemComponentIds.BLOCK_PLACER, value = BlockPlacerDefinition.class),
		@Type(name = ItemComponentIds.ENTITY_PLACER, value = EntityPlacerDefinition.class),
		@Type(name = ItemComponentIds.KNOCKBACK_RESISTANCE, value = KnockbackResistanceDefinition.class),
		@Type(name = ItemComponentIds.ENCHANTABLE, value = EnchantableDefinition.class),
		@Type(name = ItemComponentIds.SHOOTER, value = ShooterDefinition.class),
		@Type(name = ItemComponentIds.DURABILITY, value = DurabilityDefinition.class),
		@Type(name = ItemComponentIds.ARMOR, value = ArmorDefinition.class),
		@Type(name = ItemComponentIds.WEARABLE, value = WearableDefinition.class),
		@Type(name = ItemComponentIds.WEAPON, value = WeaponDefinition.class),
		@Type(name = ItemComponentIds.RECORD, value = RecordDefinition.class),
		@Type(name = ItemComponentIds.REPAIRABLE, value = RepairableDefinition.class),
		@Type(name = ItemComponentIds.COOLDOWN, value = CooldownDefinition.class),
		@Type(name = ItemComponentIds.ON_USE_ON, value = OnUseOnDefinition.class),
		@Type(name = ItemComponentIds.ON_USE, value = OnUseDefinition.class),
		@Type(name = ItemComponentIds.DIGGER, value = DiggerDefinition.class),
		@Type(name = ItemComponentIds.FERTILIZER, value = FertilizerDefinition.class),
		@Type(name = ItemComponentIds.FUEL, value = FuelDefinition.class),
		@Type(name = ItemComponentIds.THROWABLE, value = ThrowableDefinition.class),
		@Type(name = ItemComponentIds.MAP, value = MapDefinition.class),
		@Type(name = ItemComponentIds.POTION, value = PotionDefinition.class),
		@Type(name = ItemComponentIds.HANGING_ENTITY, value = HangingEntityDefinition.class),
		@Type(name = ItemComponentIds.CREATIVE_CATEGORY, value = CreativeCategoryDefinition.class),
		@Type(name = ItemComponentIds.ICON, value = IconDefinition.class),
		@Type(name = ItemComponentIds.USE_ANIMATION, value = UseAnimationDefinition.class),
		@Type(name = ItemComponentIds.RENDER_OFFSETS, value = RenderOffsetsDefinition.class),
		@Type(name = ItemComponentIds.HOVER_TEXT_COLOR, value = HoverTextColorDefinition.class),
		@Type(name = ItemComponentIds.FOOD, value = FoodDefinition.class),
		@Type(name = ItemComponentIds.DISPLAY_NAME, value = DisplayNameDefinition.class),
		@Type(name = ItemComponentIds.DAMAGEABLE, value = DamageableDefinition.class),
		@Type(name = ItemComponentIds.USE_ON, value = UseOnDefinition.class),
		@Type(name = ItemComponentIds.SEED, value = SeedDefinition.class),
		@Type(name = ItemComponentIds.DYE_POWDER, value = DyePowderDefinition.class),
		@Type(name = ItemComponentIds.DYEABLE, value = DyeableDefinition.class),
		@Type(name = ItemComponentIds.COAL, value = CoalDefinition.class),
		@Type(name = ItemComponentIds.CARROT_ON_A_STICK, value = CarrotOnAStickDefinition.class),
		@Type(name = ItemComponentIds.CAMERA, value = CameraDefinition.class)

})
public interface ItemComponentNode extends PackNode {
}
