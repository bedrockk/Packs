package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.SingleValueNode;

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
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
