package com.bedrockk.behaviorpacks.json;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.behaviorpacks.type.SemVersion;
import com.fasterxml.jackson.databind.util.StdConverter;

public abstract class VersionedConverter<T> extends StdConverter<T, T> {

    public SemVersion getVersion() {
        return PackHelper.CURRENT_DEFINITION_VERSION;
    }
}
