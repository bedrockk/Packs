package com.bedrockk.packs.json;

import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.databind.JsonNode;

public interface VersionConverter {

	default JsonNode toCurrent(JsonNode value, SemVersion version) {
		return value;
	}

	default JsonNode toSpecific(JsonNode value, SemVersion version) {
		return value;
	}

	abstract class None implements VersionConverter { }
}
