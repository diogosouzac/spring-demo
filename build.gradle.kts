import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES

val javaVersion by extra(JavaVersion.VERSION_11)
val snippetsDir = file("$buildDir/generated-snippets")

// versions referenced from "libs" catalog at "dependencies.gradle.kts"
buildscript {
	repositories {
		mavenCentral()
		maven {
			url = uri("https://plugins.gradle.org/m2/")
		}
	}

	dependencies {
		classpath(libs.kotlinAllOpenPlugin)
		classpath(libs.kotlinGradlePlugin)
		classpath(libs.kotlinNoArgPlugin)
		classpath(libs.moduleDependencyGraph)
		classpath(libs.springBootGradlePlugin)
		classpath(libs.taskTreePlugin)
	}
}

plugins {
	java
	jacoco
	kotlin("jvm") version libs.versions.kotlin
	kotlin("plugin.spring") version libs.versions.kotlin
	kotlin("plugin.jpa") version libs.versions.kotlin

	alias(libs.plugins.asciidoctor)
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.task.tree)
	alias(libs.plugins.module.dependency.graph)
}

apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "org.jetbrains.kotlin.plugin.allopen")
apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
apply(plugin = "org.jetbrains.kotlin.plugin.spring")

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	google()
	maven {
		url = uri("https://prepo.sumoci.net/artifactory/libs-release-local")
	}
}

extra["snippetsDir"] = file("build/generated-snippets")
extra["testcontainersVersion"] = "1.17.2"

dependencies {
	implementation(enforcedPlatform(BOM_COORDINATES))
	testImplementation(enforcedPlatform(BOM_COORDINATES))
	annotationProcessor(enforcedPlatform(BOM_COORDINATES))
	testAnnotationProcessor(enforcedPlatform(BOM_COORDINATES))

	annotationProcessor(libs.lombok)

	implementation(libs.guava)
	implementation(libs.jacksonModuleKotlin)
	implementation(libs.jsoup)
	implementation(libs.kotlinStdlibJdk8)
	implementation(libs.lombok)
	implementation(libs.orika)
	implementation(libs.s3)
	implementation(libs.springBootStarterDataJpa)
	implementation(libs.springBootStarterValidation)
	implementation(libs.springBootStarterWeb)
	implementation(libs.vavr)
	implementation(libs.javaInject)

	runtimeOnly(libs.groovy) // needed for Sentry appender (production only)
	runtimeOnly(libs.mysqlConnectorJava)

	testAnnotationProcessor(libs.lombok)

	testImplementation(libs.archJunit)
	testImplementation(libs.bytebuddy)
	testImplementation(libs.junitVintage) {
		// recommended exclusion from the Spring Boot team
		exclude(group = "org.hamcrest", module = "hamcrest-core")
	}
	testImplementation(libs.mockitoInline)
	testImplementation(libs.mockitoKotlin)
	testImplementation(libs.pactJvmSpring)
	testImplementation(libs.restAssured)
	testImplementation(libs.restAssuredJsonPath)
	testImplementation(libs.restAssuredKotlinExtensions)
	testImplementation(libs.restAssuredXmlPath)
	testImplementation(libs.springBootStarterTest)
	testImplementation(libs.springRestdocsCore)
	testImplementation(libs.springRestdocsRestassured)
	testImplementation(libs.wiremock)
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
