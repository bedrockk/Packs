package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.description.BlockDescription;
import com.bedrockk.packs.node.PackNode;
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
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
