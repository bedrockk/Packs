package com.bedrockk.behaviorpacks.definition.item;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.node.ItemComponentNode;
import com.bedrockk.behaviorpacks.node.SingleValueNode;
import com.bedrockk.behaviorpacks.type.SlotType;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.Locale;

@JsonSince("1.16.100")
public class UseAnimationDefinition extends SingleValueNode<UseAnimationDefinition.Type> implements ItemComponentNode {
	public UseAnimationDefinition(Type value) {
		super(value);
	}

	public enum Type {
		BOW,
		DRINK,
		EAT,
		CROSSBOW,
		CAMERA;

		@Override
		@JsonValue
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
