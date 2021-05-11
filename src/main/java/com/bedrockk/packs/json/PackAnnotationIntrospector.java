package com.bedrockk.packs.json;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class PackAnnotationIntrospector extends JacksonAnnotationIntrospector {

	public SemVersion findJsonSince(Annotated annotated) {
		JsonSince since = this._findAnnotation(annotated, JsonSince.class);
		if (since != null) {
			return SemVersion.of(since.value());
		}
		return FormatVersions.V1_8_0;
	}

	public SemVersion findJsonUntil(Annotated annotated) {
		JsonUntil since = this._findAnnotation(annotated, JsonUntil.class);
		if (since != null) {
			return SemVersion.of(since.value());
		}
		return FormatVersions.V1_17_0;
	}
}
