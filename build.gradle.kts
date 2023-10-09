import com.xiaohaoo.gradle.plugin.MavenPublishingPluginExtension

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("com.xiaohaoo:maven-publishing-gradle-plugin:1.0.2")
    }
}

plugins {
    java
}

apply(plugin = "com.xiaohaoo.maven-publishing")

group = "com.xiaohaoo"
version = "1.0.6"

repositories {
    mavenLocal()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("com.auth0:java-jwt:3.18.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework:spring-web:6.0.0")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}


configure<MavenPublishingPluginExtension> {
    url.set("https://github.com/xiaohaoo/xiaohao-toolkit")
    description.set("项目公共工具类库")
}