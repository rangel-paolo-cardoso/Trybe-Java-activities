plugins {
    id("java")
}

group = "org.rangel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("org.apache.commons:commons-lang3:3.11")
}

tasks.test {
    useJUnitPlatform()
}