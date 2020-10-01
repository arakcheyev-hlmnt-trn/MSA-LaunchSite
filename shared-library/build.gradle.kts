import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.spring.dependency-management")
    id("org.asciidoctor.convert")
    kotlin("jvm")
    kotlin("plugin.spring")
}


group = "com.graph"
version = "0.0.1-SNAPSHOT"
java {
    sourceCompatibility = JavaVersion.VERSION_11
}


repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "Hoxton.SR8"

dependencies {
    implementation("org.springframework:spring-context:5.2.8.RELEASE")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

dependencyManagement {
    imports {
        //mavenBom("org.springframework.boot:spring-boot-dependencies:2.3.3.RELEASE")
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}
