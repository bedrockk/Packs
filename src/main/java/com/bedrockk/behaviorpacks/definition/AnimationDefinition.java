package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.type.AnimationEvent;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AnimationDefinition implements Definition {
    private int animationLength;
    private boolean loop;
    private Map<String, List<AnimationEvent>> timeline;
}
