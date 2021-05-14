package com.bedrockk.packs.definition;

import com.bedrockk.packs.json.VersionPropertyDeserializer;
import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.node.VersionedNode;
import com.bedrockk.packs.type.AnimationEvent;
import com.bedrockk.packs.type.AnimationLoopType;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AnimationDefinition implements VersionedNode, Definition {
	@JsonDeserialize(using = VersionPropertyDeserializer.class)
	private SemVersion formatVersion;
	private Map<String, Animation> animations;

	@Data
	public static class Animation implements PackNode {
		private double animationLength;
		private AnimationLoopType loop;
		private Map<String, List<AnimationEvent>> timeline;
	}
}
