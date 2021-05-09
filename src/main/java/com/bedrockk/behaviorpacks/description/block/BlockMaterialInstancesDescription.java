package com.bedrockk.behaviorpacks.description.block;

import com.bedrockk.behaviorpacks.annotation.JsonSince;
import com.bedrockk.behaviorpacks.description.BlockDescription;
import com.bedrockk.behaviorpacks.node.PackNode;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.HashMap;
import java.util.Locale;

@JsonSince("1.16.100")
public class BlockMaterialInstancesDescription extends HashMap<String, BlockMaterialInstancesDescription.MaterialInstance> implements BlockDescription {

	@Data
	public static class MaterialInstance implements PackNode {
		private String texture;
		private RenderType renderMethod;
		private boolean ambientOcclusion;
		private boolean faceDimming;
	}

	public enum RenderType {
		OPAQUE,
		BLEND,
		ALPHA_TEST,
		DOUBLE_SIDED;

		@Override
		@JsonValue
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
