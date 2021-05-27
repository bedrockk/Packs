package com.bedrockk.packs.type;

import com.bedrockk.packs.PackHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Arrays;

public record SemVersion(int major, int minor, int revision, boolean isText) implements Comparable<SemVersion> {
	public SemVersion(int major, int minor, int revision) {
		this(major, minor, revision, false);
	}

	@JsonCreator
	public static SemVersion of(String version) {
		var v = Arrays.stream(version.split("\\.")).mapToInt(Integer::parseInt).toArray();
		return new SemVersion(v[0], v.length > 1 ? v[1] : 0, v.length > 2 ? v[2] : 0, true);
	}

	@JsonCreator
	public static SemVersion of(int[] parts) {
		return new SemVersion(parts[0], parts.length > 1 ? parts[1] : 0, parts.length > 2 ? parts[2] : 0, false);
	}

	@JsonValue
	public JsonNode toJson() {
		return PackHelper.toJsonNode(isText ? toString() : new int[]{major, minor, revision});
	}

	public String toString() {
		return major + "." + minor + "." + revision;
	}

	public boolean isHigher(SemVersion other) {
		return compareTo(other) > 0;
	}

	public boolean isHigherOrEqual(SemVersion other) {
		return compareTo(other) >= 0;
	}

	public boolean isLower(SemVersion other) {
		return compareTo(other) < 0;
	}

	public boolean isLowerOrEqual(SemVersion other) {
		return compareTo(other) <= 0;
	}

	public boolean isSame(SemVersion other) {
		return compareTo(other) == 0;
	}

	@Override
	public int compareTo(SemVersion o) {
		if (o == this) {
			return 0;
		}

		if (major > o.major) {
			return 1;
		} else if (major == o.major && minor > o.minor) {
			return 1;
		} else if (major == o.major && minor == o.minor && revision > o.revision) {
			return 1;
		} else if (major == o.major && minor == o.minor && revision == o.revision) {
			return 0;
		}

		return -1;
	}
}
