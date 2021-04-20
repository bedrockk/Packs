package com.bedrockk.behaviorpacks.type;

import java.util.Locale;

public enum CoordinateEvalOrderType {
    XYZ,
    ZYX,
    YXZ,
    XZY,
    ZXY,
    YZX;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
