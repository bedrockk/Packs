plugins {
    java
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_16
    targetCompatibility = JavaVersion.VERSION_16
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/bedrockk/*")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USER")
            password = project.findProperty("gpr.token") as String? ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.3")
    implementation("com.bedrockk:molang:1.0-SNAPSHOT")
    implementation("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

group = "com.bedrockk"
version = "1.0.2-SNAPSHOT"

tasks.named<Test>("test") {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "BedrockkPackages"
            url = uri("https://maven.pkg.github.com/bedrockk/Packs")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USER")
                password = project.findProperty("gpr.token") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
