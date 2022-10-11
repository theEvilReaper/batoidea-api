plugins {
    java
    `maven-publish`
    `java-library`
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    maven("https://jitpack.io")
    maven("https://repo.maven.apache.org/maven2/")
    maven("https://mvnrepository.com/artifact/org.redisson/redisson")
}

dependencies {
    api(libs.ts3j)
    api(libs.redis)
    api(libs.mongoDB)
    api(libs.morphia)
    api(libs.annotations)
    api(libs.guava)
    api(libs.tinyLogApi)
    api(libs.tinyLogImpl)
    //Dependencies for testing
    testImplementation(libs.junitApi)
    testImplementation(libs.mockitoCore)
    testImplementation(libs.mockitoJunit)
    testRuntimeOnly(libs.junitEngine)
}

group = "net.theEvilReaper.batoidea"
version = "1.0.0-SNAPSHOT"
description = "batoidea-api"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    jar {
        dependsOn("shadowJar")
        archiveFileName.set("${rootProject.name}.${archiveExtension.getOrElse("jar")}")
    }

    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.properties["group"] as String?
            artifactId = project.name
            version = project.properties["version"] as String?
            from(components["java"])
        }
    }
}
