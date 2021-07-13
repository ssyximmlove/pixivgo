plugins {
    kotlin("jvm")
}

group = "moe.peanutmelonseedbigalmond"
version = "0.0.1-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation ("junit:junit:4.+")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("com.squareup.okio:okio:2.9.0")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2-native-mt")
}