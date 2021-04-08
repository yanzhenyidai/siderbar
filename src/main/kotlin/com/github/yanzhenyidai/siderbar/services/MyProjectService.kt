package com.github.yanzhenyidai.siderbar.services

import com.github.yanzhenyidai.siderbar.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
