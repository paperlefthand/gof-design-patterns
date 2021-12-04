plugins {
    // Apply the java plugin to add support for Java
    java
    // Apply the application plugin to add support for building a CLI application.
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("io.freefair.lombok") version "6.3.0"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    mavenCentral()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application.
    mainClass.set("pattern.Main")
}

javafx {
    this.version = "17"
    this.modules = listOf("javafx.controls", "javafx.fxml")
}

// ./gradlew run で標準入力を受け付ける
//val run: JavaExec by tasks
//run.standardInput = System.`in`

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}