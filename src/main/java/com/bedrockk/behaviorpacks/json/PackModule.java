package com.bedrockk.behaviorpacks.json;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class PackModule extends SimpleModule {

    @Override
    public String getModuleName() {
        return "BedrockPacks";
    }

    @Override
    public void setupModule(SetupContext context) {
        context.addSerializers(new PackSerializers());
        context.addDeserializers(new PackDeserializers());
    }
}
