package com.github.hannesa2.gradleplugingenerategitchangelog.services

import com.intellij.openapi.project.Project
import com.github.hannesa2.gradleplugingenerategitchangelog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
