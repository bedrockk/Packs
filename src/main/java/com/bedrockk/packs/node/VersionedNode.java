package com.bedrockk.packs.node;

import com.bedrockk.packs.type.SemVersion;

public interface VersionedNode {
	SemVersion getFormatVersion();

	void setFormatVersion(SemVersion version);
}
