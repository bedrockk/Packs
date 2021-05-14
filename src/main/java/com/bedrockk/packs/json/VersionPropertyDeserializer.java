package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class VersionPropertyDeserializer extends JsonDeserializer<SemVersion> {
	@Override
	public SemVersion deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		SemVersion version = SemVersion.of(p.getText());
		if (PackHelper.CURRENT_DEFINITION_VERSION == null) {
			PackHelper.CURRENT_DEFINITION_VERSION = version;
		}
		return version;
	}
}
