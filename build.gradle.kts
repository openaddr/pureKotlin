import org.jetbrains.kotlin.gradle.plugin.statistics.ReportStatisticsToElasticSearch.url
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
buildscript {
    repositories {
        maven( "https://maven.aliyun.com/repository/public")  // 修改1
        mavenCentral()  // maven官方的吧？
        mavenLocal()  // 本地仓库
    }
}


plugins {
    kotlin("jvm") version "1.6.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public")  // 修改2

    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test"))
    implementation("cn.hutool:hutool-all:5.8.5")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}