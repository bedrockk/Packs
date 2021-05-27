package com.bedrockk.packs.definition;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.SemVersion;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Data
@Builder
@Jacksonized
public class PackManifestDefinition implements Definition {
	@Builder.Default
	private int formatVersion = 1;
	private Header header;
	@Singular
	private List<Module> modules;
	@Singular
	private List<Dependency> dependencies;
	@Singular
	private List<Capability> capabilities;
	@Singular
	private List<SubPack> subpacks;
	private Metadata metadata;

	@Data
	@Builder
	@Jacksonized
	public static class Header implements PackNode {
		private String name;
		private UUID uuid;
		private SemVersion version;
		private String description;
		private SemVersion baseGameVersion;
		private boolean lockTemplateOptions;
		@Builder.Default
		private String minEngineVersion = "1.16.0";
	}

	@Data
	@Builder
	@Jacksonized
	public static class Module implements PackNode {
		private String description;
		private ModuleType type;
		private SemVersion version;
		private UUID uuid;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class Dependency implements PackNode {
		private UUID uuid;
		private SemVersion version;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor(staticName = "of")
	public static class SubPack implements PackNode {
		private String folderName;
		private String name;
		private int memoryTier;
	}

	@Data
	@Builder
	@Jacksonized
	public static class Metadata implements PackNode {
		@Singular
		private List<String> authors;
		private String license;
		private String url;
	}

	public enum ModuleType {
		RESOURCES,
		CLIENT_DATA,
		INTERFACE,
		WORLD_TEMPLATE;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}

	public enum Capability {
		EXPERIMENTAL_CUSTOM_UI,
		CHEMISTRY,
		RAYTRACED;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}
