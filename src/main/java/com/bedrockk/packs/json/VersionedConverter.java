package com.bedrockk.packs.json;

import com.bedrockk.packs.PackHelper;
import com.bedrockk.packs.type.SemVersion;
import com.fasterxml.jackson.databind.util.StdConverter;

public abstract class VersionedConverter<T> extends StdConverter<T, T> {

	public SemVersion getVersion() {
		return PackHelper.CURRENT_DEFINITION_VERSION;
	}
}
