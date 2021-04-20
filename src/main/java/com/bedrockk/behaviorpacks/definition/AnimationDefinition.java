package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.type.AnimationEvent;
import com.bedrockk.behaviorpacks.type.SemVersion;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AnimationDefinition implements Definition {
    private SemVersion formatVersion;
    private Map<String, Animation> animations;

    @Data
    public static class Animation {
        private int animationLength;
        private boolean loop;
        private Map<String, List<AnimationEvent>> timeline;
    }
}
