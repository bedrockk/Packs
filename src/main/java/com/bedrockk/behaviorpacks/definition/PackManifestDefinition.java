package com.bedrockk.behaviorpacks.definition;

import com.bedrockk.behaviorpacks.type.SemVersion;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Data
public class PackManifestDefinition implements Definition {

    private int formatVersion = 1;
    private Header header;
    private List<Module> modules = Collections.emptyList();
    private List<Dependency> dependencies = Collections.emptyList();
    private List<Capability> capabilities = Collections.emptyList();
    private List<SubPack> subPacks = Collections.emptyList();
    private Metadata metadata;

    @Data
    public static class Header {
        private String name;
        private UUID uuid;
        private SemVersion version;
        private String description;
        private SemVersion baseGameVersion;
        private boolean lockTemplateOptions = false;
        private String minEngineVersion = "1.16.0";
    }

    @Data
    public static class Module {
        private String description;
        private ModuleType type;
        private SemVersion version;
        private UUID uuid;
    }

    @Data
    public static class Dependency {
        private UUID uuid;
        private SemVersion version;
    }

    @Data
    public static class SubPack {
        private String folderName;
        private String name;
        private int memoryTier;
    }

    @Data
    public static class Metadata {
        private List<String> authors = new ArrayList<>();
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
            return name().toLowerCase();
        }
    }

    public enum Capability {
        EXPERIMENTAL_CUSTOM_UI,
        CHEMISTRY,
        RAYTRACED;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
