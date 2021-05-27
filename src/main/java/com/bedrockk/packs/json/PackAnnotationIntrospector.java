package com.bedrockk.packs.json;

import com.bedrockk.packs.annotation.JsonConverter;
import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.type.SemVersion;
import com.bedrockk.packs.utils.FormatVersions;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Converter;

public class PackAnnotationIntrospector extends JacksonAnnotationIntrospector {

	public SemVersion findJsonSince(Annotated annotated) {
		var since = _findAnnotation(annotated, JsonSince.class);
		if (since != null) {
			return SemVersion.of(since.value());
		}
		return FormatVersions.V1_8_0;
	}

	public SemVersion findJsonUntil(Annotated annotated) {
		var since = _findAnnotation(annotated, JsonUntil.class);
		if (since != null) {
			return SemVersion.of(since.value());
		}
		return FormatVersions.V1_17_0;
	}

	@Override
	public Object findDeserializationConverter(Annotated a) {
		var c = super.findDeserializationConverter(a);
		if (c == null) {
			var ann = _findAnnotation(a, JsonConverter.class);
			return ann == null ? null : _classIfExplicit(ann.current(), Converter.None.class);
		}
		return c;
	}

	@Override
	public Object findSerializationConverter(Annotated a) {
		var c = super.findSerializationConverter(a);
		if (c == null) {
			var ann = _findAnnotation(a, JsonConverter.class);
			return ann == null ? null : _classIfExplicit(ann.past(), Converter.None.class);
		}
		return c;
	}
}
