package com.sam.detector

import org.gradle.api.Plugin
import org.gradle.api.Project

class DetectPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        // 构建逻辑
        println("hello")
    }


}
