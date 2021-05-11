package com.bedrockk.packs.definition;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.EntityMaterialType;
import com.bedrockk.packs.type.ExpressionNode;
import lombok.Data;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

@Data
public class AttachableDefinition extends VersionedDefinition {
	private Description description;

	@Data
	public static class Description implements PackNode {
		private String identifier;
		private Map<String, ExpressionNode> item;
		private Map<String, EntityMaterialType> materials;
		private Map<String, Path> textures;
		private Map<String, String> geometry;
		private Scripts scripts;
		private List<String> renderControllers;
	}

	@Data
	public static class Scripts implements PackNode {
		private List<ExpressionNode> preAnimation;
		private ExpressionNode parentSetup;
	}
}
