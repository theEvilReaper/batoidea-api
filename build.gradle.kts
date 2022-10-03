plugins {
    java
    `maven-publish`
}

repositories {
    maven("https://jitpack.io")
    maven("https://repo.maven.apache.org/maven2/")
    maven("https://mvnrepository.com/artifact/org.redisson/redisson")
}

dependencies {
    implementation(libs.ts3j)
    implementation(libs.redis)
    implementation(libs.mongoDB)
    implementation(libs.morphia)
    implementation(libs.annotations)
    implementation(libs.guava)
    //Dependencies for testing
    testImplementation(libs.junitApi)
    testImplementation(libs.mockitoCore)
    testImplementation(libs.mockitoJunit)
    testRuntimeOnly(libs.junitEngine)
}

group = "batoidea-api"
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

    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}


publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
