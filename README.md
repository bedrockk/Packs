# BehaviorPacks
<img src="https://github.com/bedrockk/BehaviorPacks/workflows/Java CI/badge.svg" alt="CI" />

A library for de/serialization of definitions on Minecraft: BE BehaviorPacks

**_Still Work In Progress.._**

### How to get Java Package

I'm currently using Github Packages for publishing.

1. Add the authentication to your global `settings.xml` to access Github Package Registry
``` xml
<servers>
    <server>
        <id>github</id>
        <username>YOUR_USERNAME</username>
        <password>YOUR_AUTH_TOKEN</password>
    </server>
</servers>
```

2. Add the bedrockk's package repository to `pom.xml`
```xml
<repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/bedrockk/*</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

3. Add the dependency what you want: https://github.com/orgs/bedrockk/packages