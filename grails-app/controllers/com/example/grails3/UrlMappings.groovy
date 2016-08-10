package com.example.grails3

class UrlMappings {

    static mappings = {
        "/users"(resources:"user") {
            "/hellos"(resources:"hello")
        }
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
