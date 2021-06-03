package com.github.jialei123.myplugindemo.services

import com.github.jialei123.myplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
