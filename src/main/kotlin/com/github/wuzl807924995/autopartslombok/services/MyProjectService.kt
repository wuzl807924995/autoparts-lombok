package com.github.wuzl807924995.autopartslombok.services

import com.intellij.openapi.project.Project
import com.github.wuzl807924995.autopartslombok.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
